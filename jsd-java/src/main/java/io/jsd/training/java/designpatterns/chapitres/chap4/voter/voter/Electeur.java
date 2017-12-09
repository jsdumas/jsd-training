package io.jsd.training.java.designpatterns.chapitres.chap4.voter.voter;

public interface Electeur {
    boolean metsAJour(String attributModifie,
            Object nouvelleValeur);
}
