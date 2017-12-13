package io.jsd.training.java.designpattern.chapitres.chap6.dessinAbstractFactory.dessin.bibliothequegraphique;

public class Point2D implements Point {
    protected int x;
    protected int y;

    public Point2D(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

}
