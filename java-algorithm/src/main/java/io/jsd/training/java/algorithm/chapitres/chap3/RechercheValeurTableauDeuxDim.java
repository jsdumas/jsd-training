package io.jsd.training.java.algorithm.chapitres.chap3;

import java.util.Scanner;

public class RechercheValeurTableauDeuxDim {

	public static int[] rechercheValeurTableauDeuxDim(int valeur, int[][] tab) {
		int[] resultat = new int[2];
		int i, j;
		boolean trouve;
		i = 0;
		j = 0; // valeur par défaut pour le compilateur Java
		trouve = false;
		while ((i < tab.length) && (!trouve)) {
			j = 0;
			while ((j < tab[i].length) && (!trouve)) {
				if (tab[i][j] == valeur)
					trouve = true;
				else
					j++;
			}
			if (!trouve)
				i++;
		}
		if (trouve) {
			resultat[0] = i;
			resultat[1] = j;
		} else {
			resultat[0] = -1;
			resultat[1] = -1;
		}
		return resultat;
	}

	public static int genereNombreAleatoire(int borneInf, int borneSup) {
		return (int) ((borneSup - borneInf + 1) * Math.random()) + borneInf;
	}

	public static void remplitTableauAleatoire(int t[], int borneInf, int borneSup) {
		for (int i = 0; i < t.length; i++)
			t[i] = genereNombreAleatoire(borneInf, borneSup);
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int taille1 = 5;
		final int taille2 = 3;
		int valeur;
		int[] resultatRecherche;
		// déclaration et initialisation du tableau
		int[][] tableau = new int[taille1][taille2];
		for (int i = 0; i < taille1; i++)
			remplitTableauAleatoire(tableau[i], 1, 10);
		for (int i = 0; i < taille1; i++) {
			for (int j = 0; j < taille2; j++)
				System.out.print(tableau[i][j] + " ");
			System.out.println();
		}
		System.out.print("Entrez la valeur à rechercher : ");
		valeur = reader.nextInt();
		// recherche dans le tableau
		resultatRecherche = rechercheValeurTableauDeuxDim(valeur, tableau);
		if (resultatRecherche[0] != -1)
			System.out.println("Valeur trouvee aux indices : " + resultatRecherche[0] + ", " + resultatRecherche[1]);
		else
			System.out.println("Valeur non trouvee dans le tableau ");
	}
}
