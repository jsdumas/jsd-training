package io.jsd.training.chapitres.chap1;

import java.util.Scanner;

public class _ToDelete_CalculPGCD {

	public static void main(String[] args) {
		int a, b, reste;
		Scanner reader = new Scanner(System.in);

		System.out.print("Entrez le premier nombre entier strictement positif : ");
		a = reader.nextInt();
		System.out.print("Entrez le second nombre entier strictement positif : ");
		b = reader.nextInt();
		reste = a % b;
		while (reste != 0) {
			a = b;
			b = reste;
			reste = a % b;
		}
		System.out.println("Le PGCD vaut : " + b);
	}
}
