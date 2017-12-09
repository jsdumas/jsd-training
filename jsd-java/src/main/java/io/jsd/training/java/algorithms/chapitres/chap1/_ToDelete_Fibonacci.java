package io.jsd.training.java.algorithms.chapitres.chap1;

import java.util.Scanner;

public class _ToDelete_Fibonacci {

	public static void main(String[] args) {
		long somme, terme, termePrecedent;
		int n, i;
		Scanner reader = new Scanner(System.in);
		do {
			System.out.println("Entrez la valeur de n (minimum 1) :");
			n = reader.nextInt();
		} while (n < 1);
		switch (n) {
			case 1:
			case 2: {
				System.out.println("Le r�sultat vaut 1");
				break;
			}
			default: {
				termePrecedent = 1;
				terme = 1;
				for (i = 3; i <= n; i++) {
					somme = terme + termePrecedent;
					termePrecedent = terme;
					terme = somme;
				}
				System.out.println("Le r�sultat de la suite de Fibonacci pour" + n + " vaut : " + terme);
			}
		}
	}
}
