package io.jsd.training.java.algorithms.chapitres.chap8.arbreb;

public class Donnee {
	public int clef;
	public String valeur;

	public Donnee(int clef, String valeur) {
		this.clef = clef;
		this.valeur = valeur;
	}

	@Override
	public String toString() {
		return clef + " " + valeur;
	}
}
