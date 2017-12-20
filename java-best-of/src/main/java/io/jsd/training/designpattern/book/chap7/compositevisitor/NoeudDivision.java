package io.jsd.training.designpattern.book.chap7.compositevisitor;

public class NoeudDivision extends NoeudOperateur {

    public NoeudDivision(Noeud sousNoeudGauche,
            Noeud sousNoeudDroit) {
        super(sousNoeudGauche, sousNoeudDroit);
    }
}
