package io.jsd.training.java.designpattern.chapitres.chap3.billetterie;
public class BilletApresDepart extends EtatBillet {
    public BilletApresDepart(Billet billet) {
        super(billet);
    }

    public void annule() {
        System.out
                .println("Impossible d'annuler un billet après le départ du vol");
    }

    public void modifie() {
        System.out
                .println("Impossible de modifier un billet après le départ du vol");
    }

    public EtatBillet etatSuivant() {
        return this;
    }
}
