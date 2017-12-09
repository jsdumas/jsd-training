package io.jsd.training.algorithms.chapitres.chap7;

import java.util.Scanner;

public class AdditionneurMultiplicateur {
	static Scanner reader = new Scanner(System.in);
	static String operateur;

	public static int addMult(int dernValeur) {
		System.out.print("Entrez un nombre ou '*' ou '+' : ");
		String ligne = reader.next();
		if ((ligne.equals("*")) || (ligne.equals("+"))) {
			operateur = ligne;
			return dernValeur;
		}
		int resultat = addMult(Integer.parseInt(ligne));
		if (operateur.equals("*"))
			return resultat * dernValeur;
		else
			return resultat + dernValeur;
	}

	public static void main(String[] args) {
		System.out.print("Entrez un premier nombre : ");
		int nombre = reader.nextInt();
		System.out.println("Total : " + addMult(nombre));
	}
}
