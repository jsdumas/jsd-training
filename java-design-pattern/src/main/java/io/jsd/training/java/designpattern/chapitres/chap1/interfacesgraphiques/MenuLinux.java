package io.jsd.training.java.designpattern.chapitres.chap1.interfacesgraphiques;
public class MenuLinux extends Menu {
    public MenuLinux(String couleur, int largeur) {
        super(couleur, largeur);
    }

    @Override
    public void afficheCaracteristiques() {
        System.out.println("Menu Linux de couleur : "
                + couleur + " de largeur : " + largeur);
    }

}
