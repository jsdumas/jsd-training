package io.jsd.training.java.algorithm.chapitres.chap4;

import java.util.Scanner;

public class TestVecteur {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int taille;

		System.out.print("Entrez la taille du vecteur : ");
		taille = reader.nextInt();
		Vecteur monVecteur = new Vecteur(taille);
		monVecteur.lis();
		monVecteur.affiche();
		monVecteur.remplisAleatoirement(1, 20);
		monVecteur.affiche();
	}
}
