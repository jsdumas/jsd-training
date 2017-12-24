package io.jsd.training.chapitres.chap8.listechaineetablehachage;

import java.util.Scanner;

public class TestListeChainee {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ListeChainee liste = new ListeChainee();
		int valeur;
		liste.insere(20, "20");
		liste.insere(50, "50");
		liste.insere(70, "70");
		liste.insere(90, "90");
		liste.affiche();
		do {
			System.out.print("Entrez une valeur e inserer (-100 pour terminer) : ");
			valeur = reader.nextInt();
			if (valeur != -100) {
				liste.insere(valeur, Integer.toString(valeur));
				liste.affiche();
			}
		} while (valeur != -100);
		do {
			System.out.print("Entrez une clef e rechercher (-100 pour terminer) : ");
			valeur = reader.nextInt();
			if (valeur != -100) {
				Donnee resultat = liste.recherche(valeur);
				if (resultat == null)
					System.out.println("Clef non trouvee");
				else
					System.out.println("valeur : " + resultat.valeur);
			}
		} while (valeur != -100);
	}
}
