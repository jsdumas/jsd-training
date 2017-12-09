package io.jsd.training.java.designpatterns.chapitres.chap5.voterstrategy;

public interface Electeur {
    Vote metsAJour(String attributModifie,
            Object nouvelleValeur);
}
