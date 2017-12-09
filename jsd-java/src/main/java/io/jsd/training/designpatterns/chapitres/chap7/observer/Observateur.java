package io.jsd.training.designpatterns.chapitres.chap7.observer;

public interface Observateur {
    void metsAJour(String attributModifie,
            Object nouvelleValeur);
}
