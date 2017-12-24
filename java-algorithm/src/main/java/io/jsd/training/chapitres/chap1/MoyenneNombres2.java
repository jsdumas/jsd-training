package io.jsd.training.chapitres.chap1;

import java.util.Scanner;

public class MoyenneNombres2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n, somme, valeur;
		double moyenne;

		somme = 0;
		n = 0;
		do {
			n++;
			System.out.print("Entrez la " + n + "e valeur (z�ro pour terminer) : ");
			valeur = reader.nextInt();
			somme += valeur;
		} while (valeur != 0);
		moyenne = (double) somme / (n - 1);
		System.out.println("La moyenne vaut : " + moyenne);
	}
}
