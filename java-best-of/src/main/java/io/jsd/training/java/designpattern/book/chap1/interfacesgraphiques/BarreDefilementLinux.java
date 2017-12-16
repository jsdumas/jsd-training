package io.jsd.training.java.designpattern.book.chap1.interfacesgraphiques;
public class BarreDefilementLinux extends BarreDefilement {
    public BarreDefilementLinux(String couleur,
            int hauteur) {
        super(couleur, hauteur);
    }

    @Override
    public void afficheCaracteristiques() {
        System.out
                .println("Barre de défilement Linux de couleur : "
                        + couleur
                        + " de hauteur : "
                        + hauteur);
    }

}
