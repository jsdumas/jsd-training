package io.jsd.training.java.algorithms.chapitres.chap2;

import java.util.Scanner;

public class RechercheValeur {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int taille = 10;
		int i, valeur;
		int nbrValeursTrouvees;
		// declaration et creation du tableau
		int[] tableau = new int[taille];
		// remplissage du tableau
		for (i = 0; i < taille; i++)
			tableau[i] = (int) (Math.random() * 10) + 1;
		// impression du tableau
		for (i = 0; i < taille; i++)
			System.out.println(" valeur du tableau à l'indice : " + i + " " + tableau[i]);

		System.out.print("Entrez la valeur à rechercher : ");
		valeur = reader.nextInt();
		// recherche dans le tableau
		nbrValeursTrouvees = 0;
		for (i = 0; i < taille; i++)
			if (tableau[i] == valeur) {
				nbrValeursTrouvees += 1;
				System.out.println("Valeur trouvée à l'indice : " + i);
			}
		if (nbrValeursTrouvees == 0)
			System.out.println("Valeur non trouvée dans le tableau ");
		else
			System.out.println("Nombre d'occurrences : " + nbrValeursTrouvees);
	}
}
