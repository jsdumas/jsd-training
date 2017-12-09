package io.jsd.training.designpatterns.chapitres.chap1.logicielpaysagiste;
public class Banc extends ObjetGraphique {
    protected String couleur;
    protected double hauteur;
    protected double largeur;

    public Banc(double coordX, double coordY,
            double coordZ, String couleur,
            double hauteur, double largeur) {
        this.couleur = couleur;
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    @Override
    public void affiche() {
        System.out.println("Un banc aux coordonnées: ("
                + coordX + "," + coordY + "," + coordZ
                + "), de couleur " + couleur
                + " d'une hauteur de " + hauteur
                + " m et d'une largeur de " + largeur
                + " m");
    }
}