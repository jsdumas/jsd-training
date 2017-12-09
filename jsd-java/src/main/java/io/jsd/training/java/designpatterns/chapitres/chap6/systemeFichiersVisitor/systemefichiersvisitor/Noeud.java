package io.jsd.training.java.designpatterns.chapitres.chap6.systemeFichiersVisitor.systemefichiersvisitor;

import java.util.List;

public interface Noeud {
    List<Noeud> noeuds();

    void ajouteNoeud(Noeud noeud);

    void supprimeNoeud(Noeud noeud);

    void accepte(Visiteur v);

}
