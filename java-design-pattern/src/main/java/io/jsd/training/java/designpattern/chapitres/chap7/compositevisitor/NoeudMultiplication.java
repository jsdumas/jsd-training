package io.jsd.training.java.designpattern.chapitres.chap7.compositevisitor;

public class NoeudMultiplication extends NoeudOperateur {

    public NoeudMultiplication(Noeud sousNoeudGauche,
            Noeud sousNoeudDroit) {
        super(sousNoeudGauche, sousNoeudDroit);
    }

}
