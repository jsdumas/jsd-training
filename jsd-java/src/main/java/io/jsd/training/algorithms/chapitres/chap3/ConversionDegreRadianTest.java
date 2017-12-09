package io.jsd.training.algorithms.chapitres.chap3;

import java.util.Scanner;

public class ConversionDegreRadianTest {

	public static double degreVersRadian(double angle) {
		return angle / 180 * Math.PI;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double angle;
		System.out.print("Entrez la valeur de l'angle en degrés : ");
		angle = reader.nextDouble();
		System.out.println("La valeur de l'angle en radians est : " + degreVersRadian(angle));
	}
}
