package io.jsd.training.designpattern.book.chap5.AbstractFactorySingleton.abstractfactorysingleton;

public class Test {

    public static void main(String[] args) {
        FabriqueGraphique fabriqueGraphique = FabriqueGraphiqueWindows
                .getInstance();
        Fenetre fenetre = fabriqueGraphique
                .creeFenetre("Nouvelle fenêtre");
        fenetre.affiche();
        FabriqueGraphique fabriqueGraphiqueMac = FabriqueGraphiqueMacintosh
                .getInstance();
        fenetre = fabriqueGraphiqueMac
                .creeFenetre("Nouvelle fenêtre");
        fenetre.affiche();
    }

}
