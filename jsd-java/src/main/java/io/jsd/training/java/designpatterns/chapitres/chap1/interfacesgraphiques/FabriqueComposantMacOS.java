package io.jsd.training.java.designpatterns.chapitres.chap1.interfacesgraphiques;
public class FabriqueComposantMacOS implements
        FabriqueComposant {
    public Bouton creeBouton(String couleur, int largeur,
            int hauteur) {
        return new BoutonMacOS(couleur, largeur, hauteur);
    }

    public Menu creeMenu(String couleur, int largeur) {
        return new MenuMacOS(couleur, largeur);
    }

    public BarreDefilement creeBarreDefilement(
            String couleur, int hauteur) {
        return new BarreDefilementMacOS(couleur, hauteur);
    }
}
