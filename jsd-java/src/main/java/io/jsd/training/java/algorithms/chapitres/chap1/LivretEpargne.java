package io.jsd.training.java.algorithms.chapitres.chap1;

import java.util.Scanner;

public class LivretEpargne {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double montantInitial, interet, montantEpargne;
		int nombreAnnees, i;
		System.out.print("Entrez le montant initial : ");
		montantInitial = reader.nextDouble();
		System.out.print("Entrez le taux d'int�r�t en pour cent : ");
		interet = reader.nextDouble();
		System.out.print("Entrez le nombre d'ann�es : ");
		nombreAnnees = reader.nextInt();
		// calcul et affichage du montant �pargn�
		montantEpargne = montantInitial;
		for (i = 1; i <= nombreAnnees; i++) {
			montantEpargne = montantEpargne * (1.0 + interet / 100);
			System.out.println("Apr�s la " + i + " ann�e, le montant �pargn� est de : " + montantEpargne);
		}
	}
}
