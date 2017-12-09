package io.jsd.training.java.algorithms.chapitres.chap8.pileexpressionpostfixee;

import java.util.Scanner;

public class TestPile {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int taillePile = 10;
		String valeur;
		Pile pile = new Pile(taillePile);
		do {
			System.out.print("Entrez une chaene ou rien pour terminer : ");
			valeur = reader.nextLine();
		} while ((valeur.length() > 0) && (pile.empile(valeur)));
		while ((valeur = pile.depile()) != null)
			System.out.println("Chaene depilee : " + valeur);
	}
}
