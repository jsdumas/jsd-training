package io.jsd.training.chapitres.chap8.arbrebinaire;

import java.util.Scanner;

public class TestArbreBinaire {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArbreBinaire arbre = new ArbreBinaire();
		int valeur;
		/*
		 * arbre.insere(20,"20"); arbre.insere(50,"50"); arbre.insere(70,"70"); arbre.insere(90,"90");
		 */
		arbre.affiche();
		do {
			System.out.print("Entrez une valeur e inserer (-100 pour terminer) : ");
			valeur = reader.nextInt();
			if (valeur != -100) {
				arbre.insere(valeur, Integer.toString(valeur));
				arbre.affiche();
			}
		} while (valeur != -100);
		do {
			System.out.print("Entrez une clef e rechercher (-100 pour terminer) : ");
			valeur = reader.nextInt();
			if (valeur != -100) {
				Donnee resultat = arbre.recherche(valeur);
				if (resultat == null)
					System.out.println("Clef non trouvee");
				else
					System.out.println("valeur : " + resultat.valeur);
			}
		} while (valeur != -100);
	}
}
