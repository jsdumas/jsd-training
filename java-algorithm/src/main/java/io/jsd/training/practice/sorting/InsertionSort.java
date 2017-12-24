package io.jsd.training.practice.sorting;

// tri par insertion
// pire des cas : O(n2)
public class InsertionSort extends Sorting {

	public void insertionSort(int[] tableau) {
		super.start = System.currentTimeMillis();
		for (int i = 1; i < tableau.length; i++) {
			int value = tableau[i];
			int currentIndex = i;
			// for (; 0 < currentIndex && value < tableau[currentIndex - 1]; currentIndex--)
			// tableau[currentIndex] = tableau[currentIndex - 1];
			while (currentIndex > 0 && tableau[currentIndex - 1] > value) {
				tableau[currentIndex] = tableau[currentIndex - 1];
				currentIndex--;
			}
			tableau[currentIndex] = value;
		}
		super.end = System.currentTimeMillis();
	}

	// trie a[l..r[
	public void insertionSort(int[] tableau, int l, int r) {
		for (int i = l + 1; i < r; i++) {
			int v = tableau[i], j = i;
			for (; l < j && v < tableau[j - 1]; j--)
				tableau[j] = tableau[j - 1];
			tableau[j] = v;
		}
	}

}