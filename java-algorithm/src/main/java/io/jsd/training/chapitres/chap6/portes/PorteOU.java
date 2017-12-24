package io.jsd.training.chapitres.chap6.portes;

public class PorteOU extends PorteImpl {

	@Override
	public boolean getSortie() {
		return entree1 || entree2;
	}
}
