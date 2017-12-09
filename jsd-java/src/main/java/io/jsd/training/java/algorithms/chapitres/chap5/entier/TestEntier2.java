package io.jsd.training.java.algorithms.chapitres.chap5.entier;

import java.util.Scanner;

public class TestEntier2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Entrez un nombre entier : ");
		String chaine = reader.nextLine();
		Entier nombreEntier = new Entier(0);
		nombreEntier.depuisChaine(chaine);
		System.out.println(nombreEntier.versChaine());
	}
}
