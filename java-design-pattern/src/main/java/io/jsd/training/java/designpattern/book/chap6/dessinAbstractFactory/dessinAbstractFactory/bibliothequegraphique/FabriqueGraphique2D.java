package io.jsd.training.java.designpattern.book.chap6.dessinAbstractFactory.dessinAbstractFactory.bibliothequegraphique;

public class FabriqueGraphique2D implements
        FabriqueGraphique {

    @Override
    public Point creePoint(int x, int y) {
        return new Point2D(x, y);
    }

}
