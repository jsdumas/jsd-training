package io.jsd.training.designpattern.book.chap6.systemeFichiersVisitor.systemefichiersvisitor;

public class VisiteurNombreFichiersImage implements
        Visiteur {
    protected long nombreDeFichiersImage;

    public long nombreDeFichiersImage(Noeud noeud) {
        nombreDeFichiersImage = 0;
        noeud.accepte(this);
        return nombreDeFichiersImage;
    }

    @Override
    public void visite(Repertoire repertoire) {
    }

    @Override
    public void visite(Fichier fichier) {
        if (fichier.getTypeFichier() == TypeFichier.IMAGE)
            nombreDeFichiersImage = nombreDeFichiersImage + 1;
    }
}
