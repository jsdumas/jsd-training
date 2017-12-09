package io.jsd.training.algorithms.chapitres.chap7.expression;

import java.util.Scanner;

public class Expression {
	Scanner reader = new Scanner(System.in);
	String token;

	public int valeur() {
		int resultat;
		System.out.print("Entrez un nombre entier : ");
		resultat = reader.nextInt();
		return resultat;
	}

	public void lireToken() {
		token = reader.next();
	}

	public int mult() {
		int opA, opB;
		String operateur;
		opA = valeur();
		System.out.print("Entrez operateur ou '=' : ");
		lireToken();
		operateur = token;
		while (operateur.equals("*") || operateur.equals("/")) {
			opB = valeur();
			if (operateur.equals("*"))
				opA = opA * opB;
			else
				opA = opA / opB;
			System.out.print("Entrez operateur ou '=' :  ");
			lireToken();
			operateur = token;
		}
		return opA;
	}

	public int add() {
		int opA, opB;
		String operateur;
		opA = mult();
		operateur = token;
		while (operateur.equals("+") || operateur.equals("-")) {
			opB = mult();
			if (operateur.equals("+"))
				opA = opA + opB;
			else
				opA = opA - opB;
			operateur = token;
		}
		return opA;
	}

	public int evalue() {
		return add();
	}
}
