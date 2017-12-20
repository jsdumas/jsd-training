package io.jsd.training.designpattern.book.chap6.dessinAbstractFactory.dessinAbstractFactory.bibliothequegraphique;

public class FabriqueGraphique2D implements
        FabriqueGraphique {

    @Override
    public Point creePoint(int x, int y) {
        return new Point2D(x, y);
    }

}
