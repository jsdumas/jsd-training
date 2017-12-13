package io.jsd.training.java.designpattern.chapitres.chap1.interfacesgraphiques;
public class BoutonWindows extends Bouton {
    public BoutonWindows(String couleur, int largeur,
            int hauteur) {
        super(couleur, largeur, hauteur);
    }

    @Override
    public void afficheCaracteristiques() {
        System.out.println("Bouton Windows de couleur : "
                + couleur + " de largeur : " + largeur
                + " de hauteur : " + hauteur);
    }
}