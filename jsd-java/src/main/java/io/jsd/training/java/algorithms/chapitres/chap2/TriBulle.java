package io.jsd.training.java.algorithms.chapitres.chap2;

public class TriBulle {

	public static void main(String[] args) {
		final int taille = 20;
		// declaration et creation du tableau a trier
		int[] t = new int[taille];
		int temp;
		boolean permute;
		// remplissage du tableau
		for (int i = 0; i < taille; i++)
			t[i] = (int) (Math.random() * 101);
		// tri bulle
		do {
			permute = false;
			for (int i = 0; i < taille - 1; i++) {
				if (t[i] > t[i + 1]) {
					// echange entre t[i] et t[i+1}
					temp = t[i];
					t[i] = t[i + 1];
					t[i + 1] = temp;
					permute = true;
				}
			}
		} while (permute);
		for (int i = 0; i < taille; i++)
			System.out.println("t[" + i + "] = " + t[i]);
	}
}
