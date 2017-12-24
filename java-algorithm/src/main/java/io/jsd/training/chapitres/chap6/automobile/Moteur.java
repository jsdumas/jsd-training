package io.jsd.training.chapitres.chap6.automobile;

public class Moteur {
	Roue roueGauche, roueDroite;
	String nom;

	public Moteur(String nom) {
		this.nom = nom;
		roueGauche = new Roue("roue gauche du " + nom);
		roueDroite = new Roue("roue droite du " + nom);
	}

	public void demarre() {
		System.out.println(nom + " a commence e demarrer.");
		roueGauche.tourne();
		roueDroite.tourne();
		System.out.println(nom + " a termine de demarrer.");
	}
}
