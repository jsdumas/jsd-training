package io.jsd.training.java.designpatterns.chapitres.chap2.points;
public class Point {
    protected double coordX;
    protected double coordY;
    protected double coordXCentreGravite;
    protected double coordYCentreGravite;

    public Point(double x, double y) {
        this.coordXCentreGravite = x;
        this.coordYCentreGravite = y;
    }

    public void setX(double x) {
        this.coordX = x;
    }

    public void setY(double y) {
        this.coordY = y;
    }

    public double getX() {
        return coordX;

    }

    public double getY() {
        return coordY;
    }

    public double calculeDistanceCentreGravite() {
        return Math.sqrt(Math.pow(coordX
                - coordXCentreGravite, 2)
                + Math.pow(coordY - coordYCentreGravite,
                        2));
    }
}
