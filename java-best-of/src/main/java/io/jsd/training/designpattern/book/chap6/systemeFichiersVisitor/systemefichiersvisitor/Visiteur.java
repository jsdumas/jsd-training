package io.jsd.training.designpattern.book.chap6.systemeFichiersVisitor.systemefichiersvisitor;

public interface Visiteur {
    void visite(Repertoire repertoire);

    void visite(Fichier fichier);
}
