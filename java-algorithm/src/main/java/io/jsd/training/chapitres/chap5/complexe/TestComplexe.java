package io.jsd.training.chapitres.chap5.complexe;

import java.util.Scanner;

public class TestComplexe {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double reel, imaginaire;
		System.out.print("Entrez la valeur reelle du nombre complexe : ");
		reel = reader.nextDouble();
		System.out.print("Entrez la valeur imaginaire du nombre complexe : ");
		imaginaire = reader.nextDouble();
		Complexe nombreComplexe = new Complexe(reel, imaginaire);
		System.out.println("Le module du nombre complexe est : " + nombreComplexe.module());
		System.out.print("Entrez un nombre reel e ajouter au nombre complexe : ");
		nombreComplexe.ajouteReel(reader.nextDouble());
		System.out.println("Le nombre complexe vaut maintenant : " + nombreComplexe);
		System.out.print("Entrez un nombre reel e multiplier au nombre complexe : ");
		nombreComplexe.multiplieReel(reader.nextDouble());
		System.out.println("Le nombre complexe vaut maintenant : " + nombreComplexe);
	}
}
