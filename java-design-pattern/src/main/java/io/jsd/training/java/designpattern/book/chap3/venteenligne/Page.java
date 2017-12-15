package io.jsd.training.java.designpattern.book.chap3.venteenligne;
public abstract class Page {
    protected Mediateur mediateur;

    public Page(Mediateur mediateur) {
        this.mediateur = mediateur;
    }
}
