package io.jsd.training.java.algorithms.chapitres.chap2;

import java.util.Scanner;

public class RechercheValeur2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int taille = 10;
		int i, valeur;
		// d�claration et cr�ation du tableau
		int[] tableau = new int[taille];
		// remplissage du tableau
		for (i = 0; i < taille; i++)
			tableau[i] = (int) (Math.random() * 10) + 1;
		// impression du tableau
		for (i = 0; i < taille; i++)
			System.out.println(" valeur du tableau � l'indice : " + i + " " + tableau[i]);

		System.out.print("Entrez la valeur � rechercher : ");
		valeur = reader.nextInt();
		// recherche dans le tableau
		i = 0;
		while ((i < taille) && (tableau[i] != valeur))
			i++;
		if (i < taille)
			System.out.println("Valeur trouv�e � l'indice : " + i);
		else
			System.out.println("Valeur non trouv�e dans le tableau ");
	}
}
