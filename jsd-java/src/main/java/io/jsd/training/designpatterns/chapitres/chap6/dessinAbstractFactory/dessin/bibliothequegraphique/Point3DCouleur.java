package io.jsd.training.designpatterns.chapitres.chap6.dessinAbstractFactory.dessin.bibliothequegraphique;

public class Point3DCouleur extends Point3D {

    protected int couleur;

    public Point3DCouleur(int x, int y, int z, int couleur) {
        super(x, y, z);
        this.couleur = couleur;
    }

    public int getCouleur() {
        return couleur;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }

}
