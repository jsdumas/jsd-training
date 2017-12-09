package io.jsd.training.java.algorithms.chapitres.chap5;

import java.util.Scanner;

public class ComptageVoyellesConsonnes {
	static String voyelles = "aeiouyAEIOUY";

	public static int compteVoyelles(String mot) {
		int resultat = 0;
		for (int i = 0; i < mot.length(); i++)
			if (voyelles.indexOf(mot.charAt(i)) != -1)
				resultat++;
		return resultat;
	}

	public static int compteConsonnes(String mot) {
		int resultat = 0;
		for (int i = 0; i < mot.length(); i++) {
			char c = mot.charAt(i);
			if ((((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z'))) && (voyelles.indexOf(c) == -1))
				resultat++;
		}
		return resultat;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Entrez le mot : ");
		String mot = reader.nextLine();
		System.out.println("Le nombre de voyelles du mot est de " + compteVoyelles(mot) + " et le nombre de consonnes est de "
				+ compteConsonnes(mot));
	}
}
