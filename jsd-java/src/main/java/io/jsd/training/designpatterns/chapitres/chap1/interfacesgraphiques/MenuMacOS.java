package io.jsd.training.designpatterns.chapitres.chap1.interfacesgraphiques;
public class MenuMacOS extends Menu {
    public MenuMacOS(String couleur, int largeur) {
        super(couleur, largeur);
    }

    @Override
    public void afficheCaracteristiques() {
        System.out.println("Menu Mac OS de couleur : "
                + couleur + " de largeur : " + largeur);
    }

}
