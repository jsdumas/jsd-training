package io.jsd.training.java.algorithm.chapitres.chap4;

import java.util.Scanner;

public class TestMatrice {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int nombreLignes, nombreColonnes;
		System.out.print(" Entrez le nombre de lignes des matrices : ");
		nombreLignes = reader.nextInt();
		System.out.print(" Entrez le nombre de colonnes des matrices : ");
		nombreColonnes = reader.nextInt();
		Matrice matrice1 = new Matrice(nombreLignes, nombreColonnes);
		matrice1.lis();
		Matrice matrice2 = new Matrice(nombreLignes, nombreColonnes);
		matrice2.lis();
		matrice1.ajoute(matrice2);
		matrice1.affiche();
	}
}
