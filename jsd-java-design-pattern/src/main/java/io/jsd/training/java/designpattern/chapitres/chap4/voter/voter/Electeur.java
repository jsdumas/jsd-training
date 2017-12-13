package io.jsd.training.java.designpattern.chapitres.chap4.voter.voter;

public interface Electeur {
    boolean metsAJour(String attributModifie,
            Object nouvelleValeur);
}
