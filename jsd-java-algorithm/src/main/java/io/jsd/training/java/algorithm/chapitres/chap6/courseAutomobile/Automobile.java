package io.jsd.training.java.algorithm.chapitres.chap6.courseAutomobile;

public class Automobile {
	NombreAleatoireCourse nombreAlea;
	int positionApres, positionAvant, vitesseMax;

	public Automobile(int vitesseMax, NombreAleatoireCourse nombreAlea) {
		this.vitesseMax = vitesseMax;
		this.nombreAlea = nombreAlea;
		positionAvant = 0;
		positionApres = 0;
	}

	public void avance() {
		positionAvant = positionApres;
		positionApres = positionApres + nombreAlea.calcule(0, vitesseMax);
	}

	public boolean aFranchiLigne(int positionLigne) {
		return positionApres > positionLigne;
	}

	public boolean aDepasse(Automobile auto) {
		return (positionApres > auto.positionApres) && (positionAvant <= auto.positionAvant);
	}
}
