package io.jsd.training.designpattern.book.chap5.voterstrategy;

public interface Electeur {
    Vote metsAJour(String attributModifie,
            Object nouvelleValeur);
}
