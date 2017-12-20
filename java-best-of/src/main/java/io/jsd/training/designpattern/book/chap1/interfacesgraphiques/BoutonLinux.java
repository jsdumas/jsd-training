package io.jsd.training.designpattern.book.chap1.interfacesgraphiques;
public class BoutonLinux extends Bouton {
    public BoutonLinux(String couleur, int largeur,
            int hauteur) {
        super(couleur, largeur, hauteur);
    }

    @Override
    public void afficheCaracteristiques() {
        System.out.println("Bouton Linux de couleur : "
                + couleur + " de largeur : " + largeur
                + " de hauteur : " + hauteur);
    }
}
