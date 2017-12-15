package io.jsd.training.java.designpattern.book.chap1.logicielpaysagiste;
public class Catalogue {
    protected Immeuble immeuble;
    protected Arbre arbre;
    protected Banc banc;

    public Catalogue() {
        immeuble = new Immeuble(0, 0, 0, "grise", 20, 2.5);
        arbre = new Arbre(0, 0, 0, 2, "marron", "verte",
                45);
        banc = new Banc(0, 0, 0, "blanche", 0.5, 2);
    }

    public Immeuble getImmeuble() {
        return (Immeuble) immeuble.duplique();
    }

    public Arbre getArbre() {
        return (Arbre) arbre.duplique();
    }

    public Banc getBanc() {
        return (Banc) banc.duplique();
    }

}
