package io.jsd.training.chapitres.chap3;

public class RemplissageTableauAleatoire {

	public static int genereNombreAleatoire(int borneInf, int borneSup) {
		return (int) ((borneSup - borneInf + 1) * Math.random()) + borneInf;
	}

	public static void remplitTableauAleatoire(int[] t, int borneInf, int borneSup) {
		for (int i = 0; i < t.length; i++)
			t[i] = genereNombreAleatoire(borneInf, borneSup);
	}

	public static void main(String[] args) {
		final int taille = 20;
		// déclaration et création du tableau
		int tableau[] = new int[taille];

		remplitTableauAleatoire(tableau, 1, 10);

		for (int i = 0; i < taille; i++)
			System.out.println(tableau[i]);
	}
}
