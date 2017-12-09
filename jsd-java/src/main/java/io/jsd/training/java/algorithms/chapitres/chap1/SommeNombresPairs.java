package io.jsd.training.java.algorithms.chapitres.chap1;

import java.util.Scanner;

public class SommeNombresPairs {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n, i;
		long somme;
		System.out.print("Donnez la valeur de n :");
		n = reader.nextInt();
		// calcul de la somme
		somme = 0;
		for (i = 2; i <= 2 * n; i += 2)
			somme += i;
		// affichage du r�sultat
		System.out.println("La somme vaut : " + somme);
	}
}
