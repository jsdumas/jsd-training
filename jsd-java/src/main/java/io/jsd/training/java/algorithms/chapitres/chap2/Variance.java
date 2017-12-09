package io.jsd.training.java.algorithms.chapitres.chap2;

import java.util.Scanner;

public class Variance {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int taille = 20;
		int i;
		int somme;
		double moyenne;
		// declaration pour le calcul de la variance et de l'ecart type
		int sommeDifferencesCarre;
		double variance, ecartType;
		// declaration du tableau
		int[] tableau;
		// creation du tableau
		tableau = new int[taille];
		// lecture du tableau
		for (i = 0; i < taille; i++) {
			System.out.print("Entrez la " + (i + 1) + "e valeur du tableau : ");
			tableau[i] = reader.nextInt();
		}
		// calcul et affichage de la moyenne
		somme = 0;
		for (i = 0; i < taille; i++)
			somme += tableau[i];
		moyenne = (double) somme / taille;
		System.out.println("La moyenne vaut : " + moyenne);
		// calcul et affichage de la variance et de l'ecart type
		sommeDifferencesCarre = 0;
		for (i = 0; i < taille; i++)
			sommeDifferencesCarre += (tableau[i] - moyenne) * (tableau[i] - moyenne);
		variance = (double) sommeDifferencesCarre / taille;
		ecartType = Math.sqrt(variance);
		System.out.println("La variance vaut : " + variance);
		System.out.println("L'ecart type vaut : " + ecartType);
	}
}
