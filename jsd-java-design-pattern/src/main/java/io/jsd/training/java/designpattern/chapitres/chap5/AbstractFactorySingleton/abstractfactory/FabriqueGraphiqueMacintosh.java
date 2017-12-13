package io.jsd.training.java.designpattern.chapitres.chap5.AbstractFactorySingleton.abstractfactory;

public class FabriqueGraphiqueMacintosh implements FabriqueGraphique {

	@Override
	public Fenetre creeFenetre(String titre) {
		return new FenetreMacintosh(titre);
	}

	@Override
	public BarreMenu creeBarreMenu() {
		return new BarreMenuMacintosh();
	}
}
