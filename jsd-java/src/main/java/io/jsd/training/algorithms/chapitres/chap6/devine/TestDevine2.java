package io.jsd.training.algorithms.chapitres.chap6.devine;

public class TestDevine2 {

	public static void main(String[] args) {
		final int min = 1;
		final int max = 12;
		int nbrTentatives;
		NombreAleatoire nbrAleatoire = new NombreAleatoire(min, max);
		DevineES devine = new DevineES(nbrAleatoire);
		nbrTentatives = devine.session();
		System.out.println("Nombre de tentatives = " + nbrTentatives);
	}
}
