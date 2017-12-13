package io.jsd.training.java.designpattern.chapitres.chap7.compositevisitor;

public class NoeudAddition extends NoeudOperateur {

    public NoeudAddition(Noeud sousNoeudGauche,
            Noeud sousNoeudDroit) {
        super(sousNoeudGauche, sousNoeudDroit);
    }

}
