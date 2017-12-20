package io.jsd.training.designpattern.book.chap5.AbstractFactorySingleton.abstractfactory;

public interface FabriqueGraphique {
	Fenetre creeFenetre(String titre);

	BarreMenu creeBarreMenu();
}
