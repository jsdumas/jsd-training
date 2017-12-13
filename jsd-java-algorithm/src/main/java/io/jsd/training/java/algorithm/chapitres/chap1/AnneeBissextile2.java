package io.jsd.training.java.algorithm.chapitres.chap1;

import java.util.Scanner;

public class AnneeBissextile2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Entrez l'annee : ");
		int annee;
		annee = reader.nextInt();
		if ((annee % 400 == 0) || (annee % 100 != 0) && (annee % 4 == 0))
			System.out.println("l'annee est bissextile");
		else
			System.out.println("l'annee n'est pas bissextile");
	}
}
