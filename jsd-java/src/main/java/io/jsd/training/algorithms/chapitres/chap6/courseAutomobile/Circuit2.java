package io.jsd.training.algorithms.chapitres.chap6.courseAutomobile;

import java.util.Scanner;

public class Circuit2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		final int positionLigne = 10000;
		boolean positionLigneAtteinte = false;
		NombreAleatoireCourse nombreAlea = new NombreAleatoireCourse();
		System.out.print("Entrez le nombre d'autombiles : ");
		int nbAutos = reader.nextInt();
		Automobile[] autos = new Automobile[nbAutos];
		for (int i = 0; i < nbAutos; i++)
			autos[i] = new Automobile(100 + 2 * i, nombreAlea);
		while (!positionLigneAtteinte) {
			for (int i = 0; i < nbAutos; i++)
				autos[i].avance();
			for (int i = 0; i < nbAutos; i++)
				for (int j = 0; j < nbAutos; j++)
					if ((i != j) && (autos[i].aDepasse(autos[j])))
						System.out.println("l'auto " + (i + 1) + " a depasse l'auto " + (j + 1));
			for (int i = 0; i < nbAutos; i++)
				if (autos[i].aFranchiLigne(positionLigne)) {
					System.out.println("l'auto " + (i + 1) + " a franchi la ligne");
					positionLigneAtteinte = true;
				}
		}
	}
}
