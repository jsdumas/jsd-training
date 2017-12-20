package io.jsd.training.designpattern.book.chap5.AbstractFactorySingleton.abstractfactorysingleton;

public class FabriqueGraphiqueWindows implements
        FabriqueGraphique {
    protected static FabriqueGraphiqueWindows instance = null;

    private FabriqueGraphiqueWindows() {
    }

    public static FabriqueGraphiqueWindows getInstance() {
        if (instance == null)
            instance = new FabriqueGraphiqueWindows();
        return instance;
    }

    @Override
    public Fenetre creeFenetre(String titre) {
        return new FenetreWindows(titre);
    }

    @Override
    public BarreMenu creeBarreMenu() {
        return new BarreMenuWindows();
    }
}
