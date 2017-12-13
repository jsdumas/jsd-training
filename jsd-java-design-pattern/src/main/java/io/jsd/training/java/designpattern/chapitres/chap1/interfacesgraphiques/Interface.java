package io.jsd.training.java.designpattern.chapitres.chap1.interfacesgraphiques;
public class Interface {
    public static int nbBoutons = 3;
    public static int nbMenus = 1;
    public static int nbBarres = 2;

    public static void main(String[] args) {
        FabriqueComposant fabrique;
        Bouton[] boutons = new Bouton[nbBoutons];
        Menu[] menus = new Menu[nbMenus];
        BarreDefilement[] barres = new BarreDefilement[nbBarres];
        System.out
                .println("Système d'exploitation Mac OS");
        fabrique = new FabriqueComposantMacOS();
        for (int index = 0; index < nbBoutons; index++)
            boutons[index] = fabrique.creeBouton("gris",
                    2, 1 + index);
        for (int index = 0; index < nbMenus; index++)
            menus[index] = fabrique.creeMenu(
                    "transparent", 10);
        for (int index = 0; index < nbBarres; index++)
            barres[index] = fabrique.creeBarreDefilement(
                    "bleu", 15 - index);
        for (Bouton bouton : boutons)
            bouton.afficheCaracteristiques();
        for (Menu menu : menus)
            menu.afficheCaracteristiques();
        for (BarreDefilement barre : barres)
            barre.afficheCaracteristiques();
        System.out
                .println("Système d'exploitation Windows");
        fabrique = new FabriqueComposantWindows();
        for (int index = 0; index < nbBoutons; index++)
            boutons[index] = fabrique.creeBouton("gris",
                    2, 1 + index);
        for (int index = 0; index < nbBarres; index++)
            barres[index] = fabrique.creeBarreDefilement(
                    "gris", 15 - index);
        for (Bouton bouton : boutons)
            bouton.afficheCaracteristiques();
        for (BarreDefilement barre : barres)
            barre.afficheCaracteristiques();
    }
}
