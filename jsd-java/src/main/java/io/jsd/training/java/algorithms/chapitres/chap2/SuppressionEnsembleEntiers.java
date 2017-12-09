package io.jsd.training.java.algorithms.chapitres.chap2;

import java.util.Scanner;

public class SuppressionEnsembleEntiers {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int tailleMaximaleEnsemble = 10;
		// d�claration et cr�ation de l'ensemble
		int tailleEnsemble = 5;
		int[] ensemble = new int[] { 1, 2, 3, 4, 5, 0, 0, 0, 0, 0 };
		// suppression d'une valeur
		int valeur;
		System.out.print("Entrez la valeur � supprimer : ");
		valeur = reader.nextInt();
		int i = 0;
		while ((i < tailleEnsemble) && (ensemble[i] != valeur))
			i++;
		if (i < tailleEnsemble) {
			tailleEnsemble--;
			for (int j = i; j < tailleEnsemble; j++)
				ensemble[j] = ensemble[j + 1];
		}
		// affichage de l�ensemble
		for (i = 0; i < tailleEnsemble; i++)
			System.out.print(ensemble[i] + " ");
		System.out.println();
	}
}
