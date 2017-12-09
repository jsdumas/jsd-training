package io.jsd.training.java.algorithms.chapitres.chap1;

import java.util.Scanner;

public class ConversionRadianDegre {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double angle;
		System.out.print("Entrez la valeur de l'angle en radians : ");
		angle = reader.nextDouble();
		System.out.println("La valeur de l'angle en degr�s est : " + angle / Math.PI * 180);
	}
}
