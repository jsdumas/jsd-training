package io.jsd.training.java.designpattern.book.chap5.AbstractFactorySingleton.abstractfactorysingleton;

public interface FabriqueGraphique {
	Fenetre creeFenetre(String titre);
	BarreMenu creeBarreMenu();
}
