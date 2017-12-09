package io.jsd.training.algorithms.chapitres.chap1;

import java.util.Scanner;

public class ImpotBenefice2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		long benefice;
		double impot;
		System.out.print("Entrez le montant du benefice : ");
		benefice = reader.nextLong();
		if (benefice <= 10000)
			impot = 0.2 * benefice;
		else if (benefice < 15000)
			impot = 2000 + 0.26 * (benefice - 10000);
		else
			impot = 0.22 * benefice;
		System.out.println("Le montant de l'impot est : " + impot);
	}
}
