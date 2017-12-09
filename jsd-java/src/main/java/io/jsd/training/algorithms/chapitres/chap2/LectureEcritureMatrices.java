package io.jsd.training.algorithms.chapitres.chap2;

import java.util.Scanner;

public class LectureEcritureMatrices {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int taille = 3;
		// d�claration et cr�ation de la matrice
		int[][] matrice = new int[taille][taille];
		// lecture de la matrice
		for (int i = 0; i < taille; i++)
			for (int j = 0; j < taille; j++) {
				System.out.print("Entrez matrice[" + i + "][" + j + "] : ");
				matrice[i][j] = reader.nextInt();
			}
		// �criture de la matrice
		for (int i = 0; i < taille; i++)
			for (int j = 0; j < taille; j++)
				System.out.println("matrice[" + i + "][" + j + "] = " + matrice[i][j]);
	}
}
