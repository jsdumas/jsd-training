package io.jsd.training.java.algorithm.chapitres.chap4;

import java.util.Scanner;

public class TestCalculatrice {
	static Scanner reader = new Scanner(System.in);

	public static double lireArgument() {
		System.out.print("Entrez la valeur de l'argument : ");
		return reader.nextDouble();
	}

	public static void main(String[] args) {
		int reponse;
		Calculatrice calc = new Calculatrice(0);
		do {
			System.out.println("La valeur de la calculatrice est : " + calc.getValeur());
			System.out.print("1. ajouter 2. multiplier : ");
			System.out.print("3. diviser un nombre 4. quitter : ");
			reponse = reader.nextInt();
			switch (reponse) {
				case 1: {
					calc.ajoute(lireArgument());
					break;
				}
				case 2: {
					calc.multiplie(lireArgument());
					break;
				}
				case 3: {
					calc.divise(lireArgument());
					break;
				}
			}
		} while (reponse != 4);
	}
}
