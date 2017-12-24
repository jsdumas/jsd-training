package io.jsd.training.chapitres.chap8.pileexpressionpostfixee;

import java.util.Scanner;

public class TestExpressionPostfixee {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String entree;
		ExpressionPostfixee expression = new ExpressionPostfixee();
		System.out.print("Entrez une premiere valeur : ");
		entree = reader.nextLine();
		expression.empileValeur(Integer.parseInt(entree));
		System.out.print("Entrez une deuxieme valeur : ");
		entree = reader.nextLine();
		expression.empileValeur(Integer.parseInt(entree));
		do {
			System.out.print("Entrez une valeur ou un operateur ou rien pour terminer : ");
			entree = reader.nextLine();
			if (entree.equals("+"))
				expression.add();
			else if (entree.equals("*"))
				expression.mult();
			else if (entree.length() > 0)
				if (!expression.empileValeur(Integer.parseInt(entree)))
					System.out.println("Depassement de capacite !");
		} while (entree.length() > 0);
		System.out.println("Resultat : " + expression.resultat());
	}
}
