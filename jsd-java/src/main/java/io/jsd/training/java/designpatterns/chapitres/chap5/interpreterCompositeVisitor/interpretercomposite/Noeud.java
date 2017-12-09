package io.jsd.training.java.designpatterns.chapitres.chap5.interpreterCompositeVisitor.interpretercomposite;

public interface Noeud {
    void ajouteSousNoeudGauche(Noeud sousNoeud);

    void ajouteSousNoeudDroit(Noeud sousNoeud);

    int valeurNoeud();
}
