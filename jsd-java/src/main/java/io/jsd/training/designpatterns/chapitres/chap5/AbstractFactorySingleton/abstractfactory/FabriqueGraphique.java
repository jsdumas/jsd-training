package io.jsd.training.designpatterns.chapitres.chap5.AbstractFactorySingleton.abstractfactory;

public interface FabriqueGraphique {
	Fenetre creeFenetre(String titre);

	BarreMenu creeBarreMenu();
}
