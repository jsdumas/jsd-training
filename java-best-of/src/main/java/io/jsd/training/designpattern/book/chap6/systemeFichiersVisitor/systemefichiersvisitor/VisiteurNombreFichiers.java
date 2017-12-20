package io.jsd.training.designpattern.book.chap6.systemeFichiersVisitor.systemefichiersvisitor;

public class VisiteurNombreFichiers implements Visiteur {
    protected long nombreDeFichiers;

    public long nombreDeFichiers(Noeud noeud) {
        nombreDeFichiers = 0;
        noeud.accepte(this);
        return nombreDeFichiers;
    }

    @Override
    public void visite(Repertoire repertoire) {
    }

    @Override
    public void visite(Fichier fichier) {
        nombreDeFichiers = nombreDeFichiers + 1;
    }
}
