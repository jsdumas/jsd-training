package io.jsd.training.designpattern.book.chap5.decoratorsubject;

public class PointSujet extends Sujet implements
        PointGraphique {

    protected PointGraphique pointReel;

    public PointSujet(PointGraphique pointReel) {
        super();
        this.pointReel = pointReel;
    }

    @Override
    public int getX() {
        return pointReel.getX();
    }

    @Override
    public int getY() {
        return pointReel.getY();
    }

    @Override
    public void setX(int x) {
        pointReel.setX(x);
        notifie("x", x);
    }

    @Override
    public void setY(int y) {
        pointReel.setY(y);
        notifie("y", y);
    }

}
