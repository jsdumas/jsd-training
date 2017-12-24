package io.jsd.training.chapitres.chap6.complexe2;

import java.util.Scanner;

public class TestComplexe2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double reel, imaginaire;
		System.out.print("Entrez la valeur reelle du nombre complexe : ");
		reel = reader.nextDouble();
		System.out.print("Entrez la valeur imaginaire du nombre complexe : ");
		imaginaire = reader.nextDouble();
		Complexe2 nombreComplexe = new Complexe2(reel, imaginaire);
		System.out.println("Le module du nombre complexe est : " + nombreComplexe.module());

		System.out.print("Entrez un reel e ajouter au nombre complexe en cours : ");
		nombreComplexe.ajouteReel(reader.nextDouble());
		System.out.println("Le nombre complexe vaut maintenant : ");
		System.out.println("Partie reelle : " + nombreComplexe.getReel() + " partie imaginaire : " + nombreComplexe.getImaginaire());

		System.out.print("Entrez un reel e multiplier au nombre complexe en cours : ");
		nombreComplexe.multiplieReel(reader.nextDouble());
		System.out.println("Le nombre complexe vaut maintenant : ");
		System.out.println("Partie reelle : " + nombreComplexe.getReel() + " partie imaginaire : " + nombreComplexe.getImaginaire());

		System.out.print("Entrez la partie reelle d'un complexe e ajouter : ");
		reel = reader.nextDouble();
		System.out.print("Entrez la partie imaginaire d'un complexe e ajouter : ");
		imaginaire = reader.nextDouble();
		Complexe2 nombreComplexe2 = new Complexe2(reel, imaginaire);
		nombreComplexe.ajouteComplexe(nombreComplexe2);
		System.out.println("Le nombre complexe vaut maintenant : ");
		System.out.println("Partie reelle : " + nombreComplexe.getReel() + " partie imaginaire : " + nombreComplexe.getImaginaire());

		System.out.print("Entrez la partie reelle d'un complexe e multiplier : ");
		reel = reader.nextDouble();
		System.out.print("Entrez la partie imaginaire d'un complexe e multiplier : ");
		imaginaire = reader.nextDouble();
		nombreComplexe2 = new Complexe2(reel, imaginaire);
		nombreComplexe.multiplieComplexe(nombreComplexe2);
		System.out.println("Le nombre complexe vaut maintenant : ");
		System.out.println("Partie reelle : " + nombreComplexe.getReel() + " partie imaginaire : " + nombreComplexe.getImaginaire());
	}
}
