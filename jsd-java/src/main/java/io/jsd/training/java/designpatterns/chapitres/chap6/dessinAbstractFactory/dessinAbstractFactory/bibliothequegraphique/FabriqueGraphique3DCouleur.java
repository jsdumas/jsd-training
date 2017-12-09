package io.jsd.training.java.designpatterns.chapitres.chap6.dessinAbstractFactory.dessinAbstractFactory.bibliothequegraphique;

public class FabriqueGraphique3DCouleur implements
        FabriqueGraphique {

    protected int zPoint;
    protected int couleur;

    public FabriqueGraphique3DCouleur(int zPoint,
            int couleur) {
        super();
        this.zPoint = zPoint;
        this.couleur = couleur;
    }

    @Override
    public Point creePoint(int x, int y) {
        return new Point3DCouleur(x, y, zPoint, couleur);
    }

}
