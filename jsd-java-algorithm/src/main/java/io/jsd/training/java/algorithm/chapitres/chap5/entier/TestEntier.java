package io.jsd.training.java.algorithm.chapitres.chap5.entier;

import java.util.Scanner;

public class TestEntier {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Entrez un nombre entier : ");
		int nombre = reader.nextInt();
		Entier nombreEntier = new Entier(nombre);
		System.out.println(nombreEntier.versChaine());
	}
}
