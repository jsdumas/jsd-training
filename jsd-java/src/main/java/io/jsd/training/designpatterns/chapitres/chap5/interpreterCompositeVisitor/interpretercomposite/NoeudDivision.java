package io.jsd.training.designpatterns.chapitres.chap5.interpreterCompositeVisitor.interpretercomposite;

public class NoeudDivision extends NoeudOperateur {

    public NoeudDivision(Noeud sousNoeudGauche,
            Noeud sousNoeudDroit) {
        super(sousNoeudGauche, sousNoeudDroit);
    }

    @Override
    public int valeurNoeud() {
        return sousNoeudGauche.valeurNoeud()
                / sousNoeudDroit.valeurNoeud();
    }

}
