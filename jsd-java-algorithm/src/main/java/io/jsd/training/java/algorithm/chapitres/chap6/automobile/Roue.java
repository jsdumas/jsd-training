package io.jsd.training.java.algorithm.chapitres.chap6.automobile;

public class Roue {
	String nom;

	public Roue(String nom) {
		this.nom = nom;
	}

	public void tourne() {
		System.out.println(nom + " tourne.");
	}
}
