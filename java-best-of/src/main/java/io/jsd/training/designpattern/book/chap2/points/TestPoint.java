package io.jsd.training.designpattern.book.chap2.points;
public class TestPoint {
    public static void main(String[] args) {
        double coordsX[] = { 0, 1, 1 };
        double coordsY[] = { 2, 6, 3 };
        double total = 0, moyenneX, moyenneY;

        for (int i = 0; i < coordsX.length; i++) {
            total += coordsX[i];
        }
        moyenneX = total / coordsX.length;
        total = 0;
        for (int i = 0; i < coordsY.length; i++) {
            total += coordsY[i];
        }
        moyenneY = total / coordsY.length;
        Point point = new Point(moyenneX, moyenneY);
        for (int i = 0; i < coordsX.length; i++) {
            point.setX(coordsX[i]);
            point.setY(coordsY[i]);
            System.out
                    .println("Distance du point "
                            + i
                            + " par rapport au centre de gravité est: "
                            + point
                                    .calculeDistanceCentreGravite());
        }
    }
}
