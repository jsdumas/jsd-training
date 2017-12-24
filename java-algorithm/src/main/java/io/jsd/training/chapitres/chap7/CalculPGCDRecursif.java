package io.jsd.training.chapitres.chap7;

import java.util.Scanner;

public class CalculPGCDRecursif {

	public static int pgcd(int a, int b) {
		if (b > 0)
			return pgcd(b, a % b);
		else
			return a;
	}

	public static void main(String[] args) {
		int a, b;
		Scanner reader = new Scanner(System.in);
		System.out.print("Entrez le premier nombre entier strictement positif : ");
		a = reader.nextInt();
		System.out.print("Entrez le second nombre entier strictement positif : ");
		b = reader.nextInt();
		System.out.println("Le PGCD vaut : " + pgcd(a, b));
	}
}
