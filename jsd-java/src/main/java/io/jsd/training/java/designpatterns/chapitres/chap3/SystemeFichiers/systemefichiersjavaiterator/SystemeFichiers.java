package io.jsd.training.java.designpatterns.chapitres.chap3.SystemeFichiers.systemefichiersjavaiterator;
import java.util.*;

public class SystemeFichiers implements Iterable<Dossier> {
    protected List<Dossier> dossiers = new ArrayList<Dossier>();
    private String nom;

    public SystemeFichiers(String nom) {
        this.nom = nom;
    }

    public String getName() {
        return nom;
    }

    public void ajouteDossier(String name,
            int nbFichiers, double taille) {
        Dossier dossier = new Dossier(name, nbFichiers,
                taille);
        dossiers.add(dossier);
    }

    public Iterator<Dossier> iterator() {
        return dossiers.iterator();
    }

}
