package io.jsd.training.designpattern.book.chap5.interpreterCompositeVisitor.interpretercomposite;

public class NoeudSoustraction extends NoeudOperateur {

    public NoeudSoustraction(Noeud sousNoeudGauche,
            Noeud sousNoeudDroit) {
        super(sousNoeudGauche, sousNoeudDroit);
    }

    @Override
    public int valeurNoeud() {
        return sousNoeudGauche.valeurNoeud()
                - sousNoeudDroit.valeurNoeud();
    }

}
