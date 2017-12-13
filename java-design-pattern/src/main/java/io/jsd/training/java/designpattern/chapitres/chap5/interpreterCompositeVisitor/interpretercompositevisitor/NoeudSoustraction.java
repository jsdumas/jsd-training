package io.jsd.training.java.designpattern.chapitres.chap5.interpreterCompositeVisitor.interpretercompositevisitor;

public class NoeudSoustraction extends NoeudOperateur {

    public NoeudSoustraction(Noeud sousNoeudGauche,
            Noeud sousNoeudDroit) {
        super(sousNoeudGauche, sousNoeudDroit);
    }

    @Override
    public int accepteVisiteurExpression(
            VisiteurExpression visiteurExpression) {
        return visiteurExpression.visite(this);
    }
}
