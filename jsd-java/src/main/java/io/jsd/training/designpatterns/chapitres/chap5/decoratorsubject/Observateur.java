package io.jsd.training.designpatterns.chapitres.chap5.decoratorsubject;

public interface Observateur {
    void metsAJour(String attributModifie,
            Object nouvelleValeur);
}
