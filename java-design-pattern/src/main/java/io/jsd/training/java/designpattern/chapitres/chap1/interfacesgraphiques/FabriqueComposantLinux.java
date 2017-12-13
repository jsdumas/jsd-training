package io.jsd.training.java.designpattern.chapitres.chap1.interfacesgraphiques;
public class FabriqueComposantLinux implements
        FabriqueComposant {
    public Bouton creeBouton(String couleur, int largeur,
            int hauteur) {
        return new BoutonLinux(couleur, largeur, hauteur);
    }

    public Menu creeMenu(String couleur, int largeur) {
        return new MenuLinux(couleur, largeur);
    }

    public BarreDefilement creeBarreDefilement(
            String couleur, int hauteur) {
        return new BarreDefilementLinux(couleur, hauteur);
    }
}
