package io.jsd.training.designpattern.book.chap4.voter.observer;

public class Point extends Sujet {
    protected int x, y;

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
        this.notifieObservateurs("x", x);
    }

    public void setY(int y) {
        this.y = y;
        this.notifieObservateurs("y", y);
    }

}
