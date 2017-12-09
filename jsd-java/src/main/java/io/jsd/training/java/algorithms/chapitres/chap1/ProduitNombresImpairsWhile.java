package io.jsd.training.java.algorithms.chapitres.chap1;

import java.util.Scanner;

public class ProduitNombresImpairsWhile {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n, i;
		long produit;
		System.out.print("Donnez la valeur de n : ");
		n = reader.nextInt();
		produit = 1;
		i = 3;
		while (i <= 2 * n - 1) {
			produit *= i;
			i += 2;
		}
		System.out.println("Le produit vaut : " + produit);
	}
}
