package io.jsd.training.java.algorithms.chapitres.chap6.devine;

public class Devine2 {
	NombreAleatoire nombreAleatoire;
	int nombreTentatives;

	public Devine2(NombreAleatoire nombreAleatoire) {
		this.nombreAleatoire = nombreAleatoire;
	}

	public int propose(int tentative) {
		nombreTentatives++;
		return nombreAleatoire.compare(tentative);
	}

	public void initialise() {
		nombreTentatives = 0;
		nombreAleatoire.reCalcule();
	}

	public int getBorneInf() {
		return nombreAleatoire.getBorneInf();
	}

	public int getBorneSup() {
		return nombreAleatoire.getBorneSup();
	}

	public int getNombreTentatives() {
		return nombreTentatives;
	}
}
