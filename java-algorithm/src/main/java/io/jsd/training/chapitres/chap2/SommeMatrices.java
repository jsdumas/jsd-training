package io.jsd.training.chapitres.chap2;

import java.util.Scanner;

public class SommeMatrices {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int taille = 3;
		// d�claration et cr�ation des matrices
		int[][] matrice1 = new int[taille][taille];
		int[][] matrice2 = new int[taille][taille];
		// lecture des matrices
		for (int i = 0; i < taille; i++)
			for (int j = 0; j < taille; j++) {
				System.out.print("Entrez matrice1[" + i + "][" + j + "] : ");
				matrice1[i][j] = reader.nextInt();
			}
		for (int i = 0; i < taille; i++)
			for (int j = 0; j < taille; j++) {
				System.out.print("Entrez matrice2[" + i + "][" + j + "] : ");
				matrice2[i][j] = reader.nextInt();
			}
		// cr�ation de la matrice r�sultat
		int[][] matrice3 = new int[taille][taille];
		for (int i = 0; i < taille; i++)
			for (int j = 0; j < taille; j++)
				matrice3[i][j] = matrice1[i][j] + matrice2[i][j];
		// �criture de la matrice r�sultat
		for (int i = 0; i < taille; i++)
			for (int j = 0; j < taille; j++)
				System.out.println("matrice somme[" + i + "][" + j + "] = " + matrice3[i][j]);
	}
}
