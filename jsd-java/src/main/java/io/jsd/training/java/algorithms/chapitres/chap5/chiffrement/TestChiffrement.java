package io.jsd.training.java.algorithms.chapitres.chap5.chiffrement;

import java.util.Scanner;

public class TestChiffrement {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Entrez le texte e chiffrer : ");
		String texte = reader.nextLine();
		TexteChiffre texteChiffre = new TexteChiffre(texte);
		System.out.println("Texte avant chiffrage : " + texteChiffre.getTexte());
		texteChiffre.chiffre();
		System.out.println("Texte apres un chiffrage : " + texteChiffre.getTexte());
		texteChiffre.chiffre();
		System.out.println("Texte apres deux chiffrages : " + texteChiffre.getTexte());
	}
}
