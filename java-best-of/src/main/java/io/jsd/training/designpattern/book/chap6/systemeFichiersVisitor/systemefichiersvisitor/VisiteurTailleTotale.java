package io.jsd.training.designpattern.book.chap6.systemeFichiersVisitor.systemefichiersvisitor;

public class VisiteurTailleTotale implements Visiteur {
    protected long totalTaille;

    public long tailleTotale(Noeud n) {
        totalTaille = 0;
        n.accepte(this);
        return totalTaille;
    }

    @Override
    public void visite(Repertoire d) {
    }

    @Override
    public void visite(Fichier f) {
        totalTaille = totalTaille + f.getTaille();
    }
}
