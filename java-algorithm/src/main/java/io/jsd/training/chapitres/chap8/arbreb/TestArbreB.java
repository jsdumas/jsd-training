package io.jsd.training.chapitres.chap8.arbreb;

import java.util.Scanner;

public class TestArbreB {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArbreB arbre = new ArbreB(2);
		int valeur;
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
