package io.jsd.training.java.designpattern.chapitres.chap6.dessinAbstractFactory.dessinAbstractFactory.bibliothequegraphique;

public class Point3D extends Point2D {

    protected int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

}
