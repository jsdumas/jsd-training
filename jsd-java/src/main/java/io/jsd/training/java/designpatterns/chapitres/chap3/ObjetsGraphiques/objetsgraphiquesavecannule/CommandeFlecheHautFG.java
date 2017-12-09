package io.jsd.training.java.designpatterns.chapitres.chap3.ObjetsGraphiques.objetsgraphiquesavecannule;
public class CommandeFlecheHautFG implements Commande {
    protected FormeGraphique recepteur;
    protected int y;

    public CommandeFlecheHautFG(FormeGraphique r) {
        this.recepteur = r;
    }

    public void lance() {
        y = recepteur.getY();
        if (y < FormeGraphique.YMAX)
            recepteur.setY(y + 1);
    }

    public void annule() {
        recepteur.setY(y);
    }
}