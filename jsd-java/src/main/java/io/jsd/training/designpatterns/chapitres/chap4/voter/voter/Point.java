package io.jsd.training.designpatterns.chapitres.chap4.voter.voter;

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
        int ancienX = this.x;
        this.x = x;
        System.out.println("Vote pour la coordonnée X "
                + x);
        if (!this.notifieElecteurs("x", x)) {
            this.x = ancienX;
            System.out
                    .println("Vote pour la coordonnée X "
                            + ancienX);
            this.notifieElecteurs("x", this.x);
        }
    }

    public void setY(int y) {
        int ancienY = this.y;
        this.y = y;
        System.out.println("Vote pour la coordonnée Y "
                + y);
        if (!this.notifieElecteurs("y", y)) {
            this.y = ancienY;
            System.out
                    .println("Vote pour la coordonnée Y "
                            + ancienY);
            this.notifieElecteurs("y", this.y);
        }
    }

}
