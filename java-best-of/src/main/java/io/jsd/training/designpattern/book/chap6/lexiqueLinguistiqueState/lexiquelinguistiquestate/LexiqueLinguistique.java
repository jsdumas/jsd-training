package io.jsd.training.designpattern.book.chap6.lexiqueLinguistiqueState.lexiquelinguistiquestate;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LexiqueLinguistique {
    protected List<String> noms = new ArrayList<String>();
    protected List<String> verbes = new ArrayList<String>();
    protected Map<String, List<String>> formesFlechiesNom = new HashMap<String, List<String>>();
    protected Map<String, List<String>> formesFlechiesVerbe = new HashMap<String, List<String>>();
    protected ByteArrayOutputStream fluxSortie = new ByteArrayOutputStream();
    protected Etat etat = new PreparationDonnees();

    protected abstract class Etat {
        public boolean ajouteNom(String leNom) {
            return false;
        }

        public boolean ajouteVerbe(String leVerbe) {
            return false;
        }

        public void libereMemoire() {
        }

        public void optimiseDonnees() {
        }

        public void supprimeOptimisation() {
        }

        public List<String> formesFlechiesNom(String leNom) {
            return null;
        }

        public List<String> formesFlechiesVerbe(
                String leVerbe) {
            return null;
        }
    }

    protected class PreparationDonnees extends Etat {
        @Override
        public boolean ajouteNom(String leNom) {
            for (String nom : noms)
                if (nom.compareToIgnoreCase(leNom) == 0)
                    return false;
            noms.add(leNom);
            return true;
        }

        @Override
        public boolean ajouteVerbe(String leVerbe) {
            for (String verbe : verbes)
                if (verbe.compareToIgnoreCase(leVerbe) == 0)
                    return false;
            verbes.add(leVerbe);
            return true;
        }

        @Override
        public void libereMemoire() {
            enregistreDonnees();
            etat = new PreparationDonneesHorsMemoire();
        }

        @Override
        public void optimiseDonnees() {
            for (String nom : noms) {
                formesFlechiesNom.put(nom, Arrays
                        .asList(nom + "s"));
            }
            for (String verbe : verbes) {
                formesFlechiesVerbe.put(verbe, Arrays
                        .asList(verbe + "s",
                                verbe + "ed", verbe
                                        + "ing"));
            }
            etat = new DonneesOptimisees();
        }

        @Override
        public List<String> formesFlechiesNom(String leNom) {
            for (String nom : noms)
                if (nom.compareToIgnoreCase(leNom) == 0)
                    return Arrays.asList(nom + "s");
            return null;
        }

        @Override
        public List<String> formesFlechiesVerbe(
                String leVerbe) {
            for (String verbe : verbes)
                if (verbe.compareToIgnoreCase(leVerbe) == 0)
                    return Arrays.asList(verbe + "s",
                            verbe + "ed", verbe + "ing");
            return null;
        }
    }

    protected class PreparationDonneesHorsMemoire extends
            Etat {
        @Override
        public boolean ajouteNom(String leNom) {
            litDonnees();
            etat = new PreparationDonnees();
            return etat.ajouteNom(leNom);
        }

        @Override
        public boolean ajouteVerbe(String leVerbe) {
            litDonnees();
            etat = new PreparationDonnees();
            return etat.ajouteVerbe(leVerbe);
        }

        @Override
        public void optimiseDonnees() {
            litDonnees();
            etat = new PreparationDonnees();
            etat.optimiseDonnees();
        }

        @Override
        public List<String> formesFlechiesNom(String leNom) {
            litDonnees();
            etat = new PreparationDonnees();
            return etat.formesFlechiesNom(leNom);
        }

        @Override
        public List<String> formesFlechiesVerbe(
                String leVerbe) {
            litDonnees();
            etat = new PreparationDonnees();
            return etat.formesFlechiesVerbe(leVerbe);
        }

    }

    protected class DonneesOptimisees extends Etat {
        @Override
        public void libereMemoire() {
            enregistreDonnees();
            etat = new DonneesOptimiseesHorsMemoire();
        }

        @Override
        public void supprimeOptimisation() {
            formesFlechiesNom.clear();
            formesFlechiesVerbe.clear();
            etat = new PreparationDonnees();
        }

        @Override
        public List<String> formesFlechiesNom(String leNom) {
            return formesFlechiesNom.get(leNom);
        }

        @Override
        public List<String> formesFlechiesVerbe(
                String leVerbe) {
            return formesFlechiesVerbe.get(leVerbe);
        }
    }

    protected class DonneesOptimiseesHorsMemoire extends
            Etat {
        @Override
        public void supprimeOptimisation() {
            litDonnees();
            etat = new DonneesOptimisees();
            etat.supprimeOptimisation();
        }

        @Override
        public List<String> formesFlechiesNom(String leNom) {
            litDonnees();
            etat = new DonneesOptimisees();
            return etat.formesFlechiesNom(leNom);
        }

        @Override
        public List<String> formesFlechiesVerbe(
                String leVerbe) {
            litDonnees();
            etat = new DonneesOptimisees();
            return etat.formesFlechiesVerbe(leVerbe);
        }
    }

    protected void enregistreDonnees() {
        try {
            fluxSortie.reset();
            ObjectOutputStream fluxObjet = new ObjectOutputStream(
                    fluxSortie);
            fluxObjet.writeObject(noms);
            fluxObjet.writeObject(verbes);
            fluxObjet.writeObject(formesFlechiesNom);
            fluxObjet.writeObject(formesFlechiesVerbe);
        } catch (IOException e) {
        }
        noms = null;
        verbes = null;
        formesFlechiesNom = null;
        formesFlechiesVerbe = null;
    }

    @SuppressWarnings("unchecked")
    protected void litDonnees() {
        try {
            ByteArrayInputStream fluxEntree = new ByteArrayInputStream(
                    fluxSortie.toByteArray());
            ObjectInputStream fluxObjet = new ObjectInputStream(
                    fluxEntree);
            noms = (List<String>) fluxObjet.readObject();
            verbes = (List<String>) fluxObjet
                    .readObject();
            formesFlechiesNom = (HashMap<String, List<String>>) fluxObjet
                    .readObject();
            formesFlechiesVerbe = (HashMap<String, List<String>>) fluxObjet
                    .readObject();
        } catch (IOException e) {
        } catch (ClassNotFoundException e) {
        }
    }

    public boolean ajouteNom(String leNom) {
        return etat.ajouteNom(leNom);
    }

    public boolean ajouteVerbe(String leVerbe) {
        return etat.ajouteVerbe(leVerbe);
    }

    public void libereMemoire() {
        etat.libereMemoire();
    }

    public void optimiseDonnees() {
        etat.optimiseDonnees();
    }

    public void supprimeOptimisation() {
        etat.supprimeOptimisation();
    }

    public List<String> formesFlechiesNom(String leNom) {
        return etat.formesFlechiesNom(leNom);
    }

    public List<String> formesFlechiesVerbe(String leVerbe) {
        return etat.formesFlechiesVerbe(leVerbe);
    }

}
