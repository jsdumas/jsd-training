package io.jsd.training.java.algorithm.chapitres.chap4;

public class TestNombreAleatoire {

	public static void main(String[] args) {
		NombreAleatoire nombre = new NombreAleatoire(1, 10);
		for (int i = 0; i < 20; i++) {
			System.out.println(nombre.getValeur());
			nombre.reCalcule();
		}
	}
}
