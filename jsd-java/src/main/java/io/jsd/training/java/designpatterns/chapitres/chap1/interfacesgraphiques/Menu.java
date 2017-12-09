package io.jsd.training.java.designpatterns.chapitres.chap1.interfacesgraphiques;
public abstract class Menu {
    protected String couleur;
    protected int largeur;

    public Menu(String couleur, int largeur) {
        this.couleur = couleur;
        this.largeur = largeur;
    }

    public abstract void afficheCaracteristiques();
}
