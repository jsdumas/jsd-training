package io.jsd.training.designpattern.book.chap7.observer;

public interface Observateur {
    void metsAJour(String attributModifie,
            Object nouvelleValeur);
}
