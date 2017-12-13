package io.jsd.training.java.algorithm.chapitres.chap3;

import java.util.Scanner;

public class GenerationAleatoire {

	public static int genereNombreAleatoire(int borneInf, int borneSup) {
		return (int) ((borneSup - borneInf + 1) * Math.random()) + borneInf;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int borneInf, borneSup;
		int nombreAleatoire;
		System.out.print("Entrez la borne inférieure : ");
		borneInf = reader.nextInt();
		System.out.print("Entrez la borne supérieure : ");
		borneSup = reader.nextInt();
		nombreAleatoire = genereNombreAleatoire(borneInf, borneSup);
		System.out.println("Le nombre aléatoire généré est : " + nombreAleatoire);
	}
}
