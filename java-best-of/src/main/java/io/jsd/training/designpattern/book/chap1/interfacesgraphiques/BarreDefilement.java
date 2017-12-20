package io.jsd.training.designpattern.book.chap1.interfacesgraphiques;
public abstract class BarreDefilement {
    protected String couleur;
    protected int hauteur;

    public BarreDefilement(String couleur, int hauteur) {
        this.couleur = couleur;
        this.hauteur = hauteur;
    }

    public abstract void afficheCaracteristiques();
}
