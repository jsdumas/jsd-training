package io.jsd.training.java.designpattern.book.chap4.voter.voter;

public interface Electeur {
    boolean metsAJour(String attributModifie,
            Object nouvelleValeur);
}
