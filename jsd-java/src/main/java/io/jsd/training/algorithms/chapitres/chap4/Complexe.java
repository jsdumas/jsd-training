package io.jsd.training.algorithms.chapitres.chap4;

public class Complexe {
	double reel, imaginaire;

	public double getReel() {
		return reel;
	}

	public double getImaginaire() {
		return imaginaire;
	}

	public void setReel(double reel) {
		this.reel = reel;
	}

	public void setImaginaire(double imaginaire) {
		this.imaginaire = imaginaire;
	}

	public Complexe(double reel, double imaginaire) {
		this.reel = reel;
		this.imaginaire = imaginaire;
	}

	public double module() {
		return Math.sqrt(reel * reel + imaginaire * imaginaire);
	}

	public void ajouteReel(double argument) {
		reel = reel + argument;
	}

	public void multiplieReel(double argument) {
		reel = reel * argument;
		imaginaire = imaginaire * argument;
	}
}
