package io.jsd.training.java.designpattern.chapitres.chap5.AbstractFactorySingleton.abstractfactorysingleton;

public class FabriqueGraphiqueMacintosh implements
        FabriqueGraphique {
    protected static FabriqueGraphiqueMacintosh instance = null;

    private FabriqueGraphiqueMacintosh() {
    }

    public static FabriqueGraphiqueMacintosh getInstance() {
        if (instance == null)
            instance = new FabriqueGraphiqueMacintosh();
        return instance;
    }

    @Override
    public Fenetre creeFenetre(String titre) {
        return new FenetreMacintosh(titre);
    }

    @Override
    public BarreMenu creeBarreMenu() {
        return new BarreMenuMacintosh();
    }
}
