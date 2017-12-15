package io.jsd.training.java.designpattern.book.chap5.voterstrategy;

public interface Electeur {
    Vote metsAJour(String attributModifie,
            Object nouvelleValeur);
}
