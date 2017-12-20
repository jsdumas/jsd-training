package io.jsd.training.designpattern.book.chap1.logicielpaysagiste;
public class Arbre extends ObjetGraphique {
    protected int hauteur;
    protected String couleurTronc;
    protected String couleurFeuilles;
    protected int densiteFeuilles;

    public Arbre(double coordX, double coordY,
            double coordZ, int hauteur,
            String couleurTronc, String couleurFeuilles,
            int densiteFeuilles) {
        this.hauteur = hauteur;
        this.couleurTronc = couleurTronc;
        this.couleurFeuilles = couleurFeuilles;
        this.densiteFeuilles = densiteFeuilles;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public void setCouleurTronc(int hauteur) {
        this.hauteur = hauteur;
    }

    public void setCouleurFeuilles(int hauteur) {
        this.hauteur = hauteur;
    }

    public void setDensiteFeuilles(int hauteur) {
        this.hauteur = hauteur;
    }

    @Override
    public void affiche() {
        System.out.println("Un arbre aux coordonnées: ("
                + coordX + "," + coordY + "," + coordZ
                + "), d'une hauteur de " + hauteur
                + " m avec un tronc de couleur "
                + couleurTronc
                + " et des feuilles de couleur "
                + couleurFeuilles + " et de densité "
                + densiteFeuilles);
    }
}
