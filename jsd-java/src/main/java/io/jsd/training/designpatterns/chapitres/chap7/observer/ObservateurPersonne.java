package io.jsd.training.designpatterns.chapitres.chap7.observer;

public class ObservateurPersonne implements Observateur {

    @Override
    public void metsAJour(String attributModifie,
            Object nouvelleValeur) {
        System.out.println(attributModifie + ": "
                + nouvelleValeur);
    }

}
