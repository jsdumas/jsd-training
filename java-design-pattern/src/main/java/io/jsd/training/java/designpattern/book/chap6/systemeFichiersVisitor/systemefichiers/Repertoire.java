package io.jsd.training.java.designpattern.book.chap6.systemeFichiersVisitor.systemefichiers;

import java.util.*;

public class Repertoire {
    protected List<Fichier> fichiers = new ArrayList<Fichier>();
    protected List<Repertoire> repertoires = new ArrayList<Repertoire>();

    public long tailleTotale() {
        long resultat = 0;

        for (Fichier fichier : fichiers)
            resultat = resultat + fichier.getTaille();
        for (Repertoire repertoire : repertoires)
            resultat = resultat
                    + repertoire.tailleTotale();
        return resultat;
    }

    public long nombreDeFichiers() {
        long resultat = fichiers.size();
        for (Repertoire repertoire : repertoires)
            resultat = resultat
                    + repertoire.nombreDeFichiers();
        return resultat;
    }

    public long nombreDeRepertoires() {
        long resultat = 1;
        for (Repertoire repertoire : repertoires)
            resultat = resultat
                    + repertoire.nombreDeRepertoires();
        return resultat;
    }

    public long nombreDeNoeuds() {
        long resultat = fichiers.size() + 1;
        for (Repertoire repertoire : repertoires)
            resultat = resultat
                    + repertoire.nombreDeNoeuds();
        return resultat;
    }

    public long nombreDeFichiersTexte() {
        long resultat = 0;
        for (Fichier fichier : fichiers)
            if (fichier.estUnFichierTexte())
                resultat = resultat + 1;
        for (Repertoire repertoire : repertoires)
            resultat = resultat
                    + repertoire.nombreDeFichiersTexte();
        return resultat;
    }

    public long nombreDeFichiersImage() {
        long resultat = 0;
        for (Fichier fichier : fichiers)
            if (fichier.estUnFichierImage())
                resultat = resultat + 1;
        for (Repertoire repertoire : repertoires)
            resultat = resultat
                    + repertoire.nombreDeFichiersImage();
        return resultat;
    }

    public void ajouteFichier(Fichier fichier) {
        fichiers.add(fichier);
    }

    public void supprimeFichier(Fichier fichier) {
        fichiers.remove(fichier);
    }

    public void ajouteRepertoire(Repertoire repertoire) {
        repertoires.add(repertoire);
    }

    public void supprimeRepertoire(Repertoire repertoire) {
        repertoires.remove(repertoire);
    }

}
