package io.jsd.training.java.designpattern.chapitres.chap1.interfacesgraphiques;
public class BoutonMacOS extends Bouton {
    public BoutonMacOS(String couleur, int largeur,
            int hauteur) {
        super(couleur, largeur, hauteur);
    }

    @Override
    public void afficheCaracteristiques() {
        System.out.println("Bouton Mac OS de couleur : "
                + couleur + " de largeur : " + largeur
                + " de hauteur : " + hauteur);
    }
}