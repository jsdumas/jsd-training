package io.jsd.training.chapitres.chap1;

import java.util.Scanner;

public class ConversionDegreRadian {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double angle;
		System.out.print("Entrez la valeur de l'angle en degres : ");
		angle = reader.nextDouble();
		System.out.println("La valeur de l'angle en radians est : " + angle / 180 * Math.PI);
	}
}
