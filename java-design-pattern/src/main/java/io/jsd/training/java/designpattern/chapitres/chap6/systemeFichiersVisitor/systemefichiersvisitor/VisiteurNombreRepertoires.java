package io.jsd.training.java.designpattern.chapitres.chap6.systemeFichiersVisitor.systemefichiersvisitor;

public class VisiteurNombreRepertoires implements
        Visiteur {
    protected long nombreDeRepertoires;

    public long nombreDeRepertoires(Noeud noeud) {
        nombreDeRepertoires = 0;
        noeud.accepte(this);
        return nombreDeRepertoires;
    }

    @Override
    public void visite(Repertoire repertoire) {
        nombreDeRepertoires = nombreDeRepertoires + 1;
    }

    @Override
    public void visite(Fichier fichier) {
    }
}
