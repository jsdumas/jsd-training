package io.jsd.training.designpattern.book.chap5.interpreterCompositeVisitor.interpretercompositevisitor;

public interface Noeud {
    void ajouteSousNoeudGauche(Noeud sousNoeud);

    void ajouteSousNoeudDroit(Noeud sousNoeud);

    Noeud getSousNoeudGauche();

    Noeud getSousNoeudDroit();

    int accepteVisiteurExpression(
            VisiteurExpression visiteurExpression);
}
