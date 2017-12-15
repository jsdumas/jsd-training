package io.jsd.training.java.designpattern.book.chap5.interpreterCompositeVisitor.interpretercompositevisitor;

public class VisiteurExpression {

    public int visite(NoeudAddition noeud) {
        return noeud.getSousNoeudGauche()
                .accepteVisiteurExpression(this)
                + noeud.getSousNoeudDroit()
                        .accepteVisiteurExpression(this);
    }

    public int visite(NoeudSoustraction noeud) {
        return noeud.getSousNoeudGauche()
                .accepteVisiteurExpression(this)
                - noeud.getSousNoeudDroit()
                        .accepteVisiteurExpression(this);
    }

    public int visite(NoeudMultiplication noeud) {
        return noeud.getSousNoeudGauche()
                .accepteVisiteurExpression(this)
                * noeud.getSousNoeudDroit()
                        .accepteVisiteurExpression(this);
    }

    public int visite(NoeudDivision noeud) {
        return noeud.getSousNoeudGauche()
                .accepteVisiteurExpression(this)
                / noeud.getSousNoeudDroit()
                        .accepteVisiteurExpression(this);
    }

    public int visite(NoeudEntier noeud) {
        return noeud.getValeur();
    }

}
