package io.jsd.training.java.algorithm.chapitres.chap1;

import java.util.Scanner;

public class ImpotBenefice3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		long benefice;
		double impot;
		System.out.print("Entrez le montant du benefice : ");
		benefice = reader.nextLong();
		impot = 0.2 * Math.min(10000, benefice);
		impot += 0.26 * Math.min(5000, Math.max(0, benefice - 10000));
		impot += 0.22 * Math.max(0, benefice - 15000);
		System.out.println("Le montant de l'impot est : " + impot);
	}
}
