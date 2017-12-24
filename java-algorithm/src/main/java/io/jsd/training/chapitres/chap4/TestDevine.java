package io.jsd.training.chapitres.chap4;

public class TestDevine {

	public static void main(String[] args) {
		final int min = 1;
		final int max = 12;
		int nbrTentatives;
		NombreAleatoire nbrAleatoire = new NombreAleatoire(min, max);
		Devine devine = new Devine(nbrAleatoire);
		nbrTentatives = devine.session();
		System.out.println("Nombre de tentatives = " + nbrTentatives);
	}
}
