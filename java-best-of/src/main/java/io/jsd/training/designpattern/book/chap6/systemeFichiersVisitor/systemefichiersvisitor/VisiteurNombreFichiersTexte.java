package io.jsd.training.designpattern.book.chap6.systemeFichiersVisitor.systemefichiersvisitor;

public class VisiteurNombreFichiersTexte implements
        Visiteur {
    protected long nombreDeFichiersTexte;

    public long nombreDeFichiersTexte(Noeud noeud) {
        nombreDeFichiersTexte = 0;
        noeud.accepte(this);
        return nombreDeFichiersTexte;
    }

    @Override
    public void visite(Repertoire repertoire) {
    }

    @Override
    public void visite(Fichier fichier) {
        if (fichier.getTypeFichier() == TypeFichier.TEXTE)
            nombreDeFichiersTexte = nombreDeFichiersTexte + 1;
    }
}
