package io.jsd.training.java.designpattern.chapitres.chap5.interpreterCompositeVisitor.interpretercomposite;

public class NoeudAddition extends NoeudOperateur {

    public NoeudAddition(Noeud sousNoeudGauche,
            Noeud sousNoeudDroit) {
        super(sousNoeudGauche, sousNoeudDroit);
    }

    @Override
    public int valeurNoeud() {
        return sousNoeudGauche.valeurNoeud()
                + sousNoeudDroit.valeurNoeud();
    }

}
