package io.jsd.training.algorithms.practice.sorting;

public class ShellSort {

	public void shellSort(int[] array) {
		int indiceMax = array.length;
		int indiceDebut = 0;
		int echange;
		int pas = 0;
		while (pas < indiceMax) {
			pas = 3 * pas + 1;
			System.out.println("Longueur du tableau " + indiceMax);
			System.out.println("Le pas est de " + pas);
			System.out.println("-----------------------------");
		}
		while (pas > 1) {
			pas = (pas - 1) / 3;
			System.out.println("Le pas est de " + pas);
			System.out.println("-----------------------------");
			System.out.println("-----------------------------");
			int i = pas;

			for (i = pas; i < indiceMax; i++) {
				int valins = array[i];
				int j = i;
				System.out.println("Valeur de valin " + valins);
				System.out.println("Valeur de j " + j);
				System.out.println("-----------------------------");
				System.out.println("-----------------------------");
				System.out.println("-----------------------------");

				while ((j >= pas) && (array[j - pas] > valins)) {
					System.out.println("La valeur de tab[j] est de " + array[j]);
					array[j] = array[j - pas];
					j = j - pas;
					System.out.println("La nouvelle valeur de tab[j] est de " + array[j]);
					System.out.println("La valeur de pas est de " + pas);
					System.out.println("La valeur de j est de " + j);
				}
				array[j] = valins;

			}

		}
	}

	/* M�thode de tri utilisant le tri Shell */
	public void shell(int[] array) {
		int h = 1; // calcul du pas
		while (h < array.length)
			h = 3 * h + 1;
		while (h > 1) {
			h = h / 3; // d�cr�mente h jusqu'� 1
			for (int i = h; i < array.length; i++) {
				int j = i;
				int valins = array[i];
				// recherche de la position d'insertion
				// quand h �gal 1, c'est un tri par insertion
				while ((j >= h) && (valins < array[j - h])) {
					array[j] = array[j - h];
					j -= h;
				}
				// insertion
				array[j] = valins;
			}
		}
	}
}
