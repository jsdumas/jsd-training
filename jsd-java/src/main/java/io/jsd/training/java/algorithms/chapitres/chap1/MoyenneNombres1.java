package io.jsd.training.java.algorithms.chapitres.chap1;

import java.util.Scanner;

public class MoyenneNombres1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n, i, somme;
		double moyenne;

		System.out.print("Entrez la valeur de n : ");
		n = reader.nextInt();
		// calcul de la moyenne
		somme = 0;
		for (i = 1; i <= n; i++) {
			System.out.print("Entrez la " + i + "e valeur : ");
			somme += reader.nextInt();
		}
		moyenne = (double) somme / n;
		// affichage du r�sultat
		System.out.println("La moyenne vaut : " + moyenne);
	}
}
