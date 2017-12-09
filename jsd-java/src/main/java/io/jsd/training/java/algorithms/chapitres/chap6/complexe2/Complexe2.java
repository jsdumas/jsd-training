package io.jsd.training.java.algorithms.chapitres.chap6.complexe2;

public class Complexe2 extends Complexe {
	public Complexe2(double reel, double imaginaire) {
		super(reel, imaginaire);
	}

	public void ajouteComplexe(Complexe argument) {
		reel = reel + argument.getReel();
		imaginaire = imaginaire + argument.getImaginaire();
	}

	public void multiplieComplexe(Complexe argument) {
		double tempReel;
		tempReel = reel * argument.getReel() - imaginaire * argument.getImaginaire();
		imaginaire = reel * argument.getImaginaire() + imaginaire * argument.getReel();
		reel = tempReel;
	}
}
