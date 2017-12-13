package io.jsd.training.java.designpattern.chapitres.chap3.ObjetsGraphiques.objetsgraphiquesavecannule;
public class CommandeFlecheBasFG implements Commande {
    protected FormeGraphique recepteur;
    protected int y;

    public CommandeFlecheBasFG(FormeGraphique r) {
        this.recepteur = r;
    }

    public void lance() {
        y = recepteur.getY();
        if (y > 0)
            recepteur.setY(y - 1);
    }

    public void annule() {
        recepteur.setY(y);
    }
}
