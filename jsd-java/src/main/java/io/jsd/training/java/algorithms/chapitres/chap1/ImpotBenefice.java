package io.jsd.training.java.algorithms.chapitres.chap1;

import java.util.Scanner;

public class ImpotBenefice {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		long benefice;
		double impot;
		System.out.print("Entrez le montant du benefice : ");
		benefice = reader.nextLong();
		if (benefice <= 10000)
			impot = 0.2 * benefice;
		else if (benefice < 15000)
			impot = 0.2 * 10000 + 0.26 * (benefice - 10000);
		else
			impot = 0.2 * 10000 + 0.26 * 5000 + 0.22 * (benefice - 15000);
		System.out.println("Le montant de l'impot est : " + impot);
	}
}
