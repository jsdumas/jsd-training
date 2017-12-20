package io.jsd.training.designpattern.book.chap4.voter.observer;

public class ObservateurCoordonnee implements Observateur {

    public void metsAJour(String attributModifie,
            Object valeur) {
        System.out
                .println("Attribut : " + attributModifie
                        + " Valeur : " + valeur);
    }

}
