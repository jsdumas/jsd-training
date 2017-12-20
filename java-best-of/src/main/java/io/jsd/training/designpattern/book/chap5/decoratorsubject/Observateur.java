package io.jsd.training.designpattern.book.chap5.decoratorsubject;

public interface Observateur {
    void metsAJour(String attributModifie,
            Object nouvelleValeur);
}
