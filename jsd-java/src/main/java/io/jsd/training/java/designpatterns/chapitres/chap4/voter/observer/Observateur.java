package io.jsd.training.java.designpatterns.chapitres.chap4.voter.observer;

public interface Observateur {
    void metsAJour(String attributModifie,
            Object nouvelleValeur);
}
