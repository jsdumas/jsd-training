package io.jsd.training.java.designpatterns.chapitres.chap6.dessinAbstractFactory.dessinAbstractFactory.bibliothequegraphique;

public class FabriqueGraphique3D implements FabriqueGraphique {

    protected int zPoint;

    public FabriqueGraphique3D(int zPoint) {
        super();
        this.zPoint = zPoint;
    }

    @Override
    public Point creePoint(int x, int y) {
        return new Point3D(x, y, zPoint);
    }

}
