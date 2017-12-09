package io.jsd.training.java.algorithms.chapitres.chap6.portes;

public abstract class PorteImpl implements Porte {
	boolean entree1, entree2;

	@Override
	public boolean getEntree1() {
		return entree1;
	}

	@Override
	public boolean getEntree2() {
		return entree2;
	}

	@Override
	public void setEntree1(boolean valeur) {
		entree1 = valeur;
	}

	@Override
	public void setEntree2(boolean valeur) {
		entree2 = valeur;
	}
}
