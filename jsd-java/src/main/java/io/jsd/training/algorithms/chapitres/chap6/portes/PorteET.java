package io.jsd.training.algorithms.chapitres.chap6.portes;

public class PorteET extends PorteImpl {

	@Override
	public boolean getSortie() {
		return entree1 && entree2;
	}
}
