package io.jsd.training.chapitres.chap6.automobile;

public class Automobile {
	Moteur moteur;
	String nom;

	public Automobile(String nom) {
		this.nom = nom;
		moteur = new Moteur("moteur de " + nom);
	}

	public void demarre() {
		System.out.println(nom + " a commence e demarrer.");
		moteur.demarre();
		System.out.println(nom + " a termine de demarrer.");
	}
}
