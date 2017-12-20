package io.jsd.training.designpattern.book.chap5.decoratorsubject;

public class ObservateurSimple implements Observateur {

    @Override
    public void metsAJour(String attributModifie,
            Object nouvelleValeur) {
        System.out.println(attributModifie + " : "
                + nouvelleValeur);
    }

}
