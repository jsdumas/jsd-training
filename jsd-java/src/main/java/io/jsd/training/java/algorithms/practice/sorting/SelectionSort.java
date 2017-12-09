package io.jsd.training.java.algorithms.practice.sorting;

// complexity : O(n2)
public class SelectionSort extends Sorting {

	public void selectionSort(int[] array) {
		super.start = System.currentTimeMillis();
		int length = array.length;
		for (int i = 0; i < length; i++) {
			int startIndice = i;
			for (int currentIndice = startIndice; currentIndice < length; currentIndice++) {
				if (array[currentIndice] < array[startIndice])
					startIndice = currentIndice;
			}
			swap(array, startIndice, i);
		}
		super.end = System.currentTimeMillis();
	}

	// M�thode de tri utilisant le tri par s�lection des valeurs minimales
	public void selectsort(int[] array) {
		int itop = array.length - 1; // dernier indice du tableau
		int imin; // indice du prochain emplacement � remplir
		for (int i = 0; i <= itop; i++) // boucle sur tous les emplacements
		{
			imin = i;
			for (int j = i + 1; j <= itop; j++) { // recherche de l'indice de val mini dans la partie non tri�e du tableau
				if (array[imin] > array[j])
					imin = j;
			}
			swap(array, imin, i);
		}
		return;
	}

}
