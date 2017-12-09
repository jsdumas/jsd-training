package io.jsd.training.java.designpatterns.chapitres.chap3.billetterie;
public abstract class EtatBillet {
    protected Billet billet;

    public EtatBillet(Billet billet) {
        this.billet = billet;
    }

    public abstract void annule();

    public abstract void modifie();

    public abstract EtatBillet etatSuivant();
}
