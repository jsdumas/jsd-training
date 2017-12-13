package io.jsd.training.java.designpattern.chapitres.chap7.compositevisitor;

public interface Noeud {
    void ajouteSousNoeudGauche(Noeud sousNoeud);

    void ajouteSousNoeudDroit(Noeud sousNoeud);

    Noeud getSousNoeudGauche();

    Noeud getSousNoeudDroit();

    void accepteVisiteurTest(VisiteurTest visiteurTest);
}
