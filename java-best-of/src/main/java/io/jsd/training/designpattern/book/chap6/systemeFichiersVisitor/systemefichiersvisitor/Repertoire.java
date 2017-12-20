package io.jsd.training.designpattern.book.chap6.systemeFichiersVisitor.systemefichiersvisitor;

import java.util.*;

public class Repertoire implements Noeud {
    protected List<Noeud> noeuds = new ArrayList<Noeud>();

    @Override
    public List<Noeud> noeuds() {
        return noeuds;
    }

    @Override
    public void ajouteNoeud(Noeud noeud) {
        noeuds.add(noeud);
    }

    @Override
    public void supprimeNoeud(Noeud noeud) {
        noeuds.remove(noeud);
    }

    @Override
    public void accepte(Visiteur v) {
        v.visite(this);
        for (Noeud noeud : noeuds)
            noeud.accepte(v);
    }

}
