package io.jsd.training.java.designpattern.book.chap1.interfacesgraphiques;
public interface FabriqueComposant {
    Bouton creeBouton(String couleur, int largeur,
            int hauteur);

    Menu creeMenu(String couleur, int largeur);

    BarreDefilement creeBarreDefilement(String couleur,
            int hauteur);
}
