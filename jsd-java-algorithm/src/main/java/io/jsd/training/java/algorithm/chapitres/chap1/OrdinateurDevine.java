package io.jsd.training.java.algorithm.chapitres.chap1;

import java.util.Scanner;

public class OrdinateurDevine {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int borneInf = 0;
		int borneSup = 100;
		int milieu;
		int reponse, nbrTentatives;

		nbrTentatives = 0;
		do {
			nbrTentatives++;
			milieu = (borneInf + borneSup) / 4 * 2;
			System.out.println("je propose " + milieu);
			System.out.println("R�pondez -1 si le nombre propos� est trop petit");
			System.out.print("1 s'il est trop grand, 0 pour gagn� : ");
			reponse = reader.nextInt();
			if (reponse == 1)
				borneSup = milieu - 2;
			else if (reponse == -1)
				borneInf = milieu + 2;
		} while (reponse != 0);
		System.out.println("gagn� en " + nbrTentatives + " coups");
	}
}
