package io.jsd.training.java.designpattern.chapitres.chap6.lexiqueLinguistiqueState.lexiquelinguistique;

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
        if (noms == null)
            litDonnees();
        if (!formesFlechiesNom.isEmpty()
                || !formesFlechiesVerbe.isEmpty())
            return false;
        for (String nom : noms)
            if (nom.compareToIgnoreCase(leNom) == 0)
                return false;
        noms.add(leNom);
        return true;
    }

    public boolean ajouteVerbe(String leVerbe) {
        if (verbes == null)
            litDonnees();
        if (!formesFlechiesNom.isEmpty()
                || !formesFlechiesVerbe.isEmpty())
            return false;
        for (String verbe : verbes)
            if (verbe.compareToIgnoreCase(leVerbe) == 0)
                return false;
        verbes.add(leVerbe);
        return true;
    }

    public void libereMemoire() {
        if (noms == null)
            return;
        enregistreDonnees();
    }

    public void optimiseDonnees() {
        if (noms == null)
            litDonnees();
        for (String nom : noms) {
            formesFlechiesNom.put(nom, Arrays.asList(nom
                    + "s"));
        }
        for (String verbe : verbes) {
            formesFlechiesVerbe.put(verbe, Arrays.asList(
                    verbe + "s", verbe + "ed", verbe
                            + "ing"));
        }
    }

    public void supprimeOptimisation() {
        if (noms == null)
            litDonnees();
        formesFlechiesNom.clear();
        formesFlechiesVerbe.clear();
    }

    public List<String> formesFlechiesNom(String leNom) {
        if (noms == null)
            litDonnees();
        if (formesFlechiesNom.isEmpty()
                && formesFlechiesVerbe.isEmpty()) {
            for (String nom : noms)
                if (nom.compareToIgnoreCase(leNom) == 0)
                    return Arrays.asList(nom + "s");
            return null;
        }
        return formesFlechiesNom.get(leNom);
    }

    public List<String> formesFlechiesVerbe(String leVerbe) {
        if (verbes == null)
            litDonnees();
        if (formesFlechiesNom.isEmpty()
                && formesFlechiesVerbe.isEmpty()) {
            for (String verbe : verbes)
                if (verbe.compareToIgnoreCase(leVerbe) == 0)
                    return Arrays.asList(verbe + "s",
                            verbe + "ed", verbe + "ing");
            return null;
        }
        return formesFlechiesVerbe.get(leVerbe);
    }

}
