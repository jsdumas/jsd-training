﻿package io.jsd.training.designpattern.book.chap6.dessinAbstractFactory.dessin.bibliothequegraphique;

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
