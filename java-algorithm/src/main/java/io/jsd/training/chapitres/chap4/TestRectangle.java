package io.jsd.training.chapitres.chap4;

import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int largeur, hauteur;
		System.out.print("Entrez la largeur du rectangle : ");
		largeur = reader.nextInt();
		System.out.print("Entrez la hauteur du rectangle : ");
		hauteur = reader.nextInt();
		Rectangle rect = new Rectangle(largeur, hauteur);
		System.out.println("Surface du rectangle : " + rect.surface());
		System.out.println("Périmetre du rectangle : " + rect.perimetre());
	}
}
