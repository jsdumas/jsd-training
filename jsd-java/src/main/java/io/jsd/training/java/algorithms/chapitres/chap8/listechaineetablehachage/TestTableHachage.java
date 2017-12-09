package io.jsd.training.java.algorithms.chapitres.chap8.listechaineetablehachage;

import java.util.Scanner;

public class TestTableHachage {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		TableHachage table = new TableHachage();
		int valeur;
		table.insere(20, "20");
		table.insere(50, "50");
		table.insere(70, "70");
		table.insere(90, "90");
		table.affiche();
		do {
			System.out.print("Entrez une valeur e inserer (-100 pour terminer) : ");
			valeur = reader.nextInt();
			if (valeur != -100) {
				table.insere(valeur, Integer.toString(valeur));
				table.affiche();
			}
		} while (valeur != -100);
		do {
			System.out.print("Entrez une clef e rechercher (-100 pour terminer) : ");
			valeur = reader.nextInt();
			if (valeur != -100) {
				Donnee resultat = table.recherche(valeur);
				if (resultat == null)
					System.out.println("Clef non trouvee");
				else
					System.out.println("valeur : " + resultat.valeur);
			}
		} while (valeur != -100);
	}
}
