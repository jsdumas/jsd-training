package io.jsd.training.algorithms.chapitres.chap2;

public class SuppressionDoublons {

	public static void main(String[] args) {
		final int taille = 20;
		// d�claration et cr�ation des tableaux
		int[] tableau = new int[taille];
		int[] tableau2 = new int[taille];
		int taille2; // nombre d'�l�ments de tableau2
		// remplissage du tableau
		for (int i = 0; i < taille; i++)
			tableau[i] = (int) (Math.random() * 11);
		// d�doublonnage
		taille2 = 0;
		for (int i = 0; i < taille; i++) {
			int j = 0;
			while (tableau[i] != tableau[j])
				j++;
			if (j == i) {
				tableau2[taille2] = tableau[i];
				taille2++;
			}
		}
		for (int i = 0; i < taille; i++)
			System.out.println("tableau initial[" + i + "] = " + tableau[i]);
		for (int i = 0; i < taille2; i++)
			System.out.println("tableau r�sultat[" + i + "] = " + tableau2[i]);
	}
}
