package io.jsd.training.designpatterns.chapitres.chap5.interpreterCompositeVisitor.interpretercomposite;

public interface Noeud {
    void ajouteSousNoeudGauche(Noeud sousNoeud);

    void ajouteSousNoeudDroit(Noeud sousNoeud);

    int valeurNoeud();
}
