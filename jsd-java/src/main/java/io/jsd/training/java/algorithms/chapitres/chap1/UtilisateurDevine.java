package io.jsd.training.java.algorithms.chapitres.chap1;

import java.util.Scanner;

public class UtilisateurDevine {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		long nombre, nombrelu;
		int nombreTentatives = 0;

		nombre = (long) (Math.random() * 51) * 2;
		System.out.println("Essayez de trouver le nombre pair (entre 0 et 100) : ");
		do {
			nombreTentatives++;
			nombrelu = reader.nextLong();
			if (nombrelu > nombre)
				System.out.println("trop grand");
			else if (nombrelu < nombre)
				System.out.println("trop petit");
		} while (nombrelu != nombre);
		System.out.println("Vous avez trouv� en " + nombreTentatives + " coups");
	}
}
