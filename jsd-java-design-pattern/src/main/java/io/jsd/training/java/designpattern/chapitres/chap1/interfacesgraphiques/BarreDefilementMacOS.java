package io.jsd.training.java.designpattern.chapitres.chap1.interfacesgraphiques;
public class BarreDefilementMacOS extends BarreDefilement {
    public BarreDefilementMacOS(String couleur,
            int hauteur) {
        super(couleur, hauteur);
    }

    @Override
    public void afficheCaracteristiques() {
        System.out
                .println("Barre de défilement Mac OS de couleur : "
                        + couleur
                        + " de hauteur : "
                        + hauteur);
    }

}
