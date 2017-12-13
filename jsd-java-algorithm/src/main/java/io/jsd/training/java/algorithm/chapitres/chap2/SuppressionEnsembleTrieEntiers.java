package io.jsd.training.java.algorithm.chapitres.chap2;

import java.util.Scanner;

public class SuppressionEnsembleTrieEntiers {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int tailleMaximaleEnsemble = 10;
		// declaration et creation de l'ensemble
		int tailleEnsemble = 10;
		int[] ensemble = new int[] { 1, 2, 3, 4, 5, 6, 8, 10, 12, 14 };
		// suppression d'une valeur
		int valeur;
		int borneGauche, borneDroite, milieu;
		boolean trouve;
		System.out.print("Entrez la valeur � supprimer : ");
		valeur = reader.nextInt();
		// recherche de la valeur par dichotomie
		borneGauche = 0;
		borneDroite = tailleEnsemble - 1;
		trouve = false;
		milieu = 0;
		while ((!trouve) && (borneGauche <= borneDroite)) {
			milieu = (borneGauche + borneDroite) / 2;
			if (ensemble[milieu] == valeur)
				trouve = true;
			else {
				if (ensemble[milieu] > valeur)
					borneDroite = milieu - 1;
				else
					borneGauche = milieu + 1;
			}
		}
		// suppression de la valeur si elle a �t� trouvee
		if (trouve) {
			tailleEnsemble--;
			for (int j = milieu; j < tailleEnsemble; j++)
				ensemble[j] = ensemble[j + 1];
		}
		for (int i = 0; i < tailleEnsemble; i++)
			System.out.print(ensemble[i] + " ");
		System.out.println();
	}
}
