package io.jsd.training.java.algorithm.chapitres.chap2;

public class TriSelection {

	public static void main(String[] args) {
		final int taille = 20;
		// declaration et creation du tableau a trier
		int[] t = new int[taille];
		int temp, indiceValeurMin;

		// remplissage du tableau
		for (int i = 0; i < taille; i++)
			t[i] = (int) (Math.random() * 101);
		// tri par selection
		for (int i = 0; i < taille; i++) {
			indiceValeurMin = i;
			// recherche de la plus petite valeur
			for (int j = i + 1; j < taille; j++)
				if (t[j] < t[indiceValeurMin])
					indiceValeurMin = j;
			// echange entre t[i]
			// et la plus petite valeur
			temp = t[i];
			t[i] = t[indiceValeurMin];
			t[indiceValeurMin] = temp;
		}
		for (int i = 0; i < taille; i++)
			System.out.println("t[" + i + "] = " + t[i]);
	}
}
