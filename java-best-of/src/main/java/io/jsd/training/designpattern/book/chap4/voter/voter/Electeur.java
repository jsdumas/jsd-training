package io.jsd.training.designpattern.book.chap4.voter.voter;

public interface Electeur {
    boolean metsAJour(String attributModifie,
            Object nouvelleValeur);
}
