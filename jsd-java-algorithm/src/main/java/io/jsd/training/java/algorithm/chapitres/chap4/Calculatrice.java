package io.jsd.training.java.algorithm.chapitres.chap4;

public class Calculatrice {
	double valeur;

	public Calculatrice(double valeur) {
		this.valeur = valeur;
	}

	public double getValeur() {
		return valeur;
	}

	public void ajoute(double argument) {
		valeur = valeur + argument;
	}

	public void multiplie(double argument) {
		valeur = valeur * argument;
	}

	public void divise(double argument) {
		valeur = valeur / argument;
	}
}
