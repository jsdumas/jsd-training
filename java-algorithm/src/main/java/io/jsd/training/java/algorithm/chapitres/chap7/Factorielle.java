package io.jsd.training.java.algorithm.chapitres.chap7;

import java.util.Scanner;

public class Factorielle {

	public static long fact(int n) {
		if (n == 0)
			return 1;
		else
			return n * fact(n - 1);
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Entrez n : ");
		int n = reader.nextInt();
		System.out.println(n + "! = " + fact(n));
	}
}
