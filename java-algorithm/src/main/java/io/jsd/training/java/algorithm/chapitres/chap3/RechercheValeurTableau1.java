package io.jsd.training.java.algorithm.chapitres.chap3;

import java.util.Scanner;

public class RechercheValeurTableau1 {
	// d�claration de la constante taille
	final static int taille = 10;
	// d�claration et cr�ation du tableau
	static int[] tableau = new int[taille];

	public static void remplitTableau() {
		int i;
		for (i = 0; i < taille; i++)
			tableau[i] = (int) (Math.random() * 10) + 1;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int i, valeur;
		// remplissage du tableau
		remplitTableau();
		// impression du tableau
		for (i = 0; i < taille; i++)
			System.out.println(" valeur du tableau � l'indice : " + i + " " + tableau[i]);

		System.out.print("Entrez la valeur � rechercher : ");
		valeur = reader.nextInt();
		// recherche dans le tableau
		i = 0;
		while ((i < taille) && (tableau[i] != valeur))
			i++;
		if (i < taille)
			System.out.println("Valeur trouv�e � l'indice : " + i);
		else
			System.out.println("Valeur non trouv�e dans le tableau ");
	}
}
