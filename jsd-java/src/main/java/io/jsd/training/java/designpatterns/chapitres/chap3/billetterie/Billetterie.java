package io.jsd.training.java.designpatterns.chapitres.chap3.billetterie;
public class Billetterie {

    public static void main(String[] args) {
        Billet billet = new Billet();
        billet.modifie();
        billet.etatSuivant();
        billet.annule();
        billet.modifie();
        billet.etatSuivant();
        billet.annule();
        billet.modifie();
    }
}
