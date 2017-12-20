package io.jsd.training.designpattern.book.chap1.interfacesgraphiques;
public abstract class Menu {
    protected String couleur;
    protected int largeur;

    public Menu(String couleur, int largeur) {
        this.couleur = couleur;
        this.largeur = largeur;
    }

    public abstract void afficheCaracteristiques();
}
