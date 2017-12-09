package io.jsd.training.algorithms.chapitres.chap1;

import java.util.Scanner;

public class AnneeBissextile1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Entrez l'ann�e : ");
		int annee;
		annee = reader.nextInt();
		if (annee % 400 == 0)
			System.out.println("l'ann�e est bissextile");
		else if (annee % 100 == 0)
			System.out.println("l'ann�e n'est pas bissextile");
		else if (annee % 4 == 0)
			System.out.println("l'ann�e est bissextile");
		else
			System.out.println("l'ann�e n'est pas bissextile");
	}
}
