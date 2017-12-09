package io.jsd.training.java.designpatterns.chapitres.chap7.compositevisitor;

public class GenerateurArbre {
    public Noeud genereArbre() {
        Noeud noeud1, noeud2, noeud3;

        noeud1 = new NoeudEntier(10);
        noeud2 = new NoeudEntier(15);
        noeud2 = new NoeudAddition(noeud1, noeud2);
        noeud1 = new NoeudEntier(6);
        noeud3 = new NoeudSoustraction(noeud1, noeud2);
        noeud1 = new NoeudEntier(5);
        noeud2 = new NoeudEntier(3);
        noeud1 = new NoeudAddition(noeud1, noeud2);
        noeud1 = new NoeudSoustraction(noeud1, noeud3);
        return noeud1;
    }
}
