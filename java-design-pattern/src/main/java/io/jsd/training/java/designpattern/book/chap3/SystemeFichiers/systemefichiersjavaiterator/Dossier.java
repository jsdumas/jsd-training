package io.jsd.training.java.designpattern.book.chap3.SystemeFichiers.systemefichiersjavaiterator;
public class Dossier {
    String nom;
    int nbFichiers;
    double taille;

    public Dossier(String nom, int nbFichiers,
            double taille) {
        this.nom = nom;
        this.nbFichiers = nbFichiers;
        this.taille = taille;
    }

    public String getNom() {
        return nom;
    }

    public void afficheInformations() {
        System.out.println("Dossier " + nom
                + " de taille: " + taille + " contenant "
                + nbFichiers + " fichiers");
    }

}
