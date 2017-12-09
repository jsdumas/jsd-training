package io.jsd.training.algorithms.chapitres.chap3;

import java.util.Scanner;

public class RechercheValeurTableau3 {
	// déclaration de la constante taille
	final static int taille = 10;
	// déclaration et création du tableau
	static int[] tableau = new int[taille];

	public static int genereNombreAleatoire(int borneInf, int borneSup) {
		return (int) ((borneSup - borneInf + 1) * Math.random()) + borneInf;
	}

	public static void remplitTableau() {
		int i;
		for (i = 0; i < taille; i++)
			tableau[i] = genereNombreAleatoire(1, 10);
	}

	public static void afficheTableau(boolean modeUneLigne) {
		int i;
		for (i = 0; i < taille; i++) {
			System.out.print(tableau[i]);
			if (modeUneLigne)
				System.out.print(" ");
			else
				System.out.println();
		}
		if (modeUneLigne)
			System.out.println();
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int i, valeur;
		int choix;
		// remplissage du tableau
		remplitTableau();
		// impression du tableau
		System.out.println("Voulez-vous afficher le tableau");
		System.out.println(" 1) sur une seule ligne");
		System.out.println(" 2) en affichant un élément par ligne");
		System.out.print(" choix : ");
		choix = reader.nextInt();
		afficheTableau(choix == 1);

		System.out.print("Entrez la valeur à rechercher : ");
		valeur = reader.nextInt();
		// recherche dans le tableau
		i = 0;
		while ((i < taille) && (tableau[i] != valeur))
			i++;
		if (i < taille)
			System.out.println("Valeur trouvée à l'indice : " + i);
		else
			System.out.println("Valeur non trouvée dans le tableau ");
	}
}
