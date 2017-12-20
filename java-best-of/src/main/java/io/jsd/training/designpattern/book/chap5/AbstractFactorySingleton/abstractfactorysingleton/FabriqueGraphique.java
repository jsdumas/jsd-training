package io.jsd.training.designpattern.book.chap5.AbstractFactorySingleton.abstractfactorysingleton;

public interface FabriqueGraphique {
	Fenetre creeFenetre(String titre);
	BarreMenu creeBarreMenu();
}
