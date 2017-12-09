package io.jsd.training.designpatterns.chapitres.chap4.voter.observer;

public class ObservateurCoordonnee implements Observateur {

    @Override
    public void metsAJour(String attributModifie,
            Object valeur) {
        System.out
                .println("Attribut : " + attributModifie
                        + " Valeur : " + valeur);
    }

}
