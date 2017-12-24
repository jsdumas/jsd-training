package io.jsd.training.chapitres.chap3;

import java.util.Scanner;

public class CalculDivisionEuclidienne {

	public static int[] divisionEuclidienne(int dividende, int diviseur) {
		int[] resultat = new int[2];
		resultat[0] = dividende / diviseur;
		resultat[1] = dividende % diviseur;
		return resultat;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int dividende, diviseur;
		int[] resultat;
		// lecture du dividende et du diviseur
		System.out.print("Entrez le dividende : ");
		dividende = reader.nextInt();
		System.out.print("Entrez le diviseur : ");
		diviseur = reader.nextInt();
		// calcul de la division
		resultat = divisionEuclidienne(dividende, diviseur);
		// affichage du resultat
		System.out.println(" le quotient de la division de " + dividende + " par " + diviseur + " est " + resultat[0]);
		System.out.println(" le reste de la division de " + dividende + " par " + diviseur + " est " + resultat[1]);
	}
}
