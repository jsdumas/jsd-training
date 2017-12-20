package io.jsd.training.designpattern.book.chap4.voter.observer;

public interface Observateur {
    void metsAJour(String attributModifie,
            Object nouvelleValeur);
}
