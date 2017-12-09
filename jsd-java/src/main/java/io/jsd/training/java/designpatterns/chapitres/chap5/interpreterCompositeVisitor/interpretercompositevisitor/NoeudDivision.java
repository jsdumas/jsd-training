package io.jsd.training.java.designpatterns.chapitres.chap5.interpreterCompositeVisitor.interpretercompositevisitor;

public class NoeudDivision extends NoeudOperateur {

    public NoeudDivision(Noeud sousNoeudGauche,
            Noeud sousNoeudDroit) {
        super(sousNoeudGauche, sousNoeudDroit);
    }

    @Override
    public int accepteVisiteurExpression(
            VisiteurExpression visiteurExpression) {
        return visiteurExpression.visite(this);
    }
}
