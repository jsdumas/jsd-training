package io.jsd.training.java.algorithm.chapitres.chap6.portes;

public class PorteOUExclusif extends PorteImpl {

	@Override
	public boolean getSortie() {
		return entree1 != entree2;
	}
}
