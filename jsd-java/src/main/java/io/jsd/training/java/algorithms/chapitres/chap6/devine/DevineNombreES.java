package io.jsd.training.java.algorithms.chapitres.chap6.devine;

import java.util.Scanner;

public class DevineNombreES {
	Scanner reader = new Scanner(System.in);

	public int propose(int tentative) {
		System.out.println("je propose " + tentative);
		System.out.println("Repondez -1 si le nombre propose est trop petit");
		System.out.print("1 s'il est trop grand, 0 pour gagne : ");
		int reponse = reader.nextInt();
		return reponse;
	}
}
