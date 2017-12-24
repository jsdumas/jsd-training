package io.jsd.training.chapitres.chap6.portes;

import java.util.Scanner;

public class TestPortes {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Porte porte = null;
		System.out.println("Quel type de porte desirez-vous utiliser ?");
		System.out.print("1. porte ET 2. porte OU 3. porte OU Exclusif ");
		int reponse = reader.nextInt();
		switch (reponse) {
			case 1:
				porte = new PorteET();
				break;
			case 2:
				porte = new PorteOU();
				break;
			case 3:
				porte = new PorteOUExclusif();
				break;
		}
		System.out.print("Entrez la valeur de la premiere entree : ");
		int entree = reader.nextInt();
		porte.setEntree1(entree != 0);
		System.out.print("Entrez la valeur de la seconde entree : ");
		entree = reader.nextInt();
		porte.setEntree2(entree != 0);
		if (porte.getSortie())
			System.out.println("la sortie vaut 1");
		else
			System.out.println("la sortie vaut 0");
	}
}
