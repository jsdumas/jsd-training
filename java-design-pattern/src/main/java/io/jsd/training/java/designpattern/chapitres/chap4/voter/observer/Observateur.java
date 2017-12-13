package io.jsd.training.java.designpattern.chapitres.chap4.voter.observer;

public interface Observateur {
    void metsAJour(String attributModifie,
            Object nouvelleValeur);
}
