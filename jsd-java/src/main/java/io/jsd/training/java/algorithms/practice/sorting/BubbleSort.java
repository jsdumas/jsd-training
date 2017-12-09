package io.jsd.training.java.algorithms.practice.sorting;

// pire des cas : O(n2)
public class BubbleSort extends Sorting {

	public void bubbleSort(int[] array) {
		super.start = System.currentTimeMillis();
		for (int i = 0; i < array.length; i++) {
			for (int currentIndice = 1; currentIndice < (array.length - i); currentIndice++) {
				if (array[currentIndice - 1] > array[currentIndice]) {
					// swap the elements!
					swap(array, currentIndice);
				}
			}
		}
		super.end = System.currentTimeMillis();
	}

	// M�thode du Tri Bulles
	public void bubbleSortWhile(int[] array) {
		int itop = array.length - 1; // dernier indice du tableau non place
		boolean permut = true; // flag indicateur de permutation
		while (permut) // boucle pple
		{
			permut = false;
			for (int i = 1; i <= itop; i++) { // parcours de la partie inf�rieure non tri�e du tableau
				if (array[i - 1] > array[i]) {
					swap(array, i, i - 1);
					permut = true;
				}
			}
			itop--; // maj du dernier indice non plac�
		}
		return;
	}

}
