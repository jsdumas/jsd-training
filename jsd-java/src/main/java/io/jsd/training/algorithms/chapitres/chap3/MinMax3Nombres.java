package io.jsd.training.algorithms.chapitres.chap3;

import java.util.Scanner;

public class MinMax3Nombres {

	static double min(double un, double deux, double trois) {
		if (un < deux)
			if (un < trois)
				return un;
			else
				return trois;
		else if (deux < trois)
			return deux;
		else
			return trois;
	}

	static double max(double un, double deux, double trois) {
		if (un > deux)
			if (un > trois)
				return un;
			else
				return trois;
		else if (deux > trois)
			return deux;
		else
			return trois;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double un, deux, trois;
		System.out.print("Entrez la valeur de premier nombre : ");
		un = reader.nextDouble();
		System.out.print("Entrez la valeur de deuxi�me nombre : ");
		deux = reader.nextDouble();
		System.out.print("Entrez la valeur de troisi�me nombre : ");
		trois = reader.nextDouble();
		System.out.println("Le minimum de : " + un + ", " + deux + ", " + trois + " est : " + min(un, deux, trois));
		System.out.println("Le maximum de : " + un + ", " + deux + ", " + trois + " est : " + max(un, deux, trois));
	}
}
