package io.jsd.training.java.algorithm.chapitres.chap1;

import java.util.Scanner;

public class ProduitNombresImpairsDoWhile {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n, i;
		long produit;
		System.out.print("Donnez la valeur de n : ");
		n = reader.nextInt();
		produit = 1;
		i = 1;
		do {
			produit *= i;
			i += 2;
		} while (i <= 2 * n - 1);
		System.out.println("Le produit vaut : " + produit);
	}
}
