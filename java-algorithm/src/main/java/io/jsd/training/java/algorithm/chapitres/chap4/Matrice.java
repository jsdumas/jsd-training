package io.jsd.training.java.algorithm.chapitres.chap4;

import java.util.Scanner;

public class Matrice {
	Scanner reader = new Scanner(System.in);
	int[][] tabMatrice;
	int nombreLignes, nombreColonnes;

	public Matrice(int nombreLignes, int nombreColonnes) {
		this.nombreLignes = nombreLignes;
		this.nombreColonnes = nombreColonnes;
		tabMatrice = new int[nombreLignes][nombreColonnes];
	}

	public int getNombreLignes() {
		return nombreLignes;
	}

	public int getNombreColonnes() {
		return nombreColonnes;
	}

	public int getTabMatrice(int ligne, int colonne) {
		return tabMatrice[ligne][colonne];
	}

	public void lis() {
		for (int i = 0; i < nombreLignes; i++)
			for (int j = 0; j < nombreColonnes; j++) {
				System.out.print("Entrez matrice[" + i + "][" + j + "] : ");
				tabMatrice[i][j] = reader.nextInt();
			}
	}

	public void affiche() {
		for (int i = 0; i < nombreLignes; i++)
			for (int j = 0; j < nombreColonnes; j++)
				System.out.println("matrice[" + i + "][" + j + "] = " + tabMatrice[i][j]);
	}

	public boolean ajoute(Matrice matrice) {
		if ((nombreLignes != matrice.getNombreLignes()) || (nombreColonnes != matrice.getNombreColonnes()))
			return false;
		for (int i = 0; i < nombreLignes; i++)
			for (int j = 0; j < nombreColonnes; j++)
				tabMatrice[i][j] = tabMatrice[i][j] + matrice.getTabMatrice(i, j);
		return true;
	}
}
