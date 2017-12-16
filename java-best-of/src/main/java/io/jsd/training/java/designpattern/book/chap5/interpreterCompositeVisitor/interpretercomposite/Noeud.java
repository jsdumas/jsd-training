package io.jsd.training.java.designpattern.book.chap5.interpreterCompositeVisitor.interpretercomposite;

public interface Noeud {
    void ajouteSousNoeudGauche(Noeud sousNoeud);

    void ajouteSousNoeudDroit(Noeud sousNoeud);

    int valeurNoeud();
}
