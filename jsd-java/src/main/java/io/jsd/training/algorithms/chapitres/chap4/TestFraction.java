package io.jsd.training.algorithms.chapitres.chap4;

import java.util.Scanner;

public class TestFraction {

	public static void main(String[] args) {
		int a, b;
		Scanner reader = new Scanner(System.in);
		System.out.println("Premiere fraction :");
		System.out.println("Entrez le numerateur puis le denominateur : ");
		a = reader.nextInt();
		b = reader.nextInt();
		Fraction frac1 = new Fraction(a, b);
		System.out.println("La valeur reelle de la premiere fraction est : " + frac1.reel());
		System.out.println("Seconde fraction :");
		System.out.println("Entrez le numerateur puis le denominateur : ");
		a = reader.nextInt();
		b = reader.nextInt();
		Fraction frac2 = new Fraction(a, b);
		Fraction frac3 = frac1.addition(frac2);
		System.out.println("Le resultat de l'addition des deux fractions est : ");
		System.out.println("Numerateur : " + frac3.numerateur);
		System.out.println("Denominateur : " + frac3.denominateur);
	}
}
