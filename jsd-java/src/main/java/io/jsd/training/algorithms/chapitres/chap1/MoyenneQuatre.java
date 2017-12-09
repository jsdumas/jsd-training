package io.jsd.training.algorithms.chapitres.chap1;

import java.util.Scanner;

public class MoyenneQuatre {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n1, n2, n3, n4;
		double moyenne;
		System.out.print("Entrez la valeur du premier nombre : ");
		n1 = reader.nextInt();
		System.out.print("Entrez la valeur du deuxi�me nombre : ");
		n2 = reader.nextInt();
		System.out.print("Entrez la valeur du troisi�me nombre : ");
		n3 = reader.nextInt();
		System.out.print("Entrez la valeur du quatri�me nombre : ");
		n4 = reader.nextInt();
		// calcul de la moyenne
		moyenne = (n1 + n2 + n3 + n4) / 4.0;
		// affichage du r�sultat
		System.out.println("La moyenne vaut : " + moyenne);
	}
}
