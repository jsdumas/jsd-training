package io.jsd.training.chapitres.chap2;

import java.util.Scanner;

public class Moyenne {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int taille = 20;
		int i;
		int somme;
		double moyenne;
		// d�claration du tableau
		int[] tableau;
		// cr�ation du tableau
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
	}
}
