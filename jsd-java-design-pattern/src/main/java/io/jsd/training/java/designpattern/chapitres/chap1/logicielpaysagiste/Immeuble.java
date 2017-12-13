package io.jsd.training.java.designpattern.chapitres.chap1.logicielpaysagiste;
public class Immeuble extends ObjetGraphique {
    protected String couleur;
    protected int nombreEtages;
    protected double hauteurEtage;

    public Immeuble(double coordX, double coordY,
            double coordZ, String couleur,
            int nombreEtages, double hauteurEtage) {
        this.couleur = couleur;
        this.nombreEtages = nombreEtages;
        this.hauteurEtage = hauteurEtage;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setNombreEtages(int nombreEtages) {
        this.nombreEtages = nombreEtages;
    }

    public void setHauteurEtage(double hauteur) {
        this.hauteurEtage = hauteur;
    }

    @Override
    public void affiche() {
        System.out.println("Un immeuble de "
                + nombreEtages
                + " étages aux coordonnées: (" + coordX
                + "," + coordY + "," + coordZ
                + "), d'une hauteur de " + nombreEtages
                * hauteurEtage + " m et de couleur "
                + couleur);
    }
}