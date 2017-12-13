package io.jsd.training.java.designpattern.chapitres.chap5.AbstractFactorySingleton.abstractfactory;

public interface FabriqueGraphique {
	Fenetre creeFenetre(String titre);

	BarreMenu creeBarreMenu();
}
