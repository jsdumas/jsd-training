package io.jsd.training.algorithms.chapitres.chap4;

import java.util.Scanner;

public class Devine {
	NombreAleatoire nombreAleatoire;
	Scanner parser = new Scanner(System.in);

	public Devine(NombreAleatoire nombreAleatoire) {
		this.nombreAleatoire = nombreAleatoire;
	}

	public int session() {
		int tentative, resultat, nbrTentatives = 0;
		do {
			System.out.print("Proposez un nombre entier entre " + nombreAleatoire.getBorneInf() + " et " + nombreAleatoire.getBorneSup()
					+ " : ");
			tentative = parser.nextInt();
			resultat = nombreAleatoire.compare(tentative);
			switch (resultat) {
				case -1: {
					System.out.println("Votre tentative est trop petite !");
					break;
				}
				case 0: {
					System.out.println("Vous avez trouve le nombre !");
					break;
				}
				case 1: {
					System.out.println("Votre tentative est trop grande !");
					break;
				}
			}
			nbrTentatives++;
		} while (resultat != 0);
		return nbrTentatives;
	}
}
