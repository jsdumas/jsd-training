package io.jsd.training.practice.sorting;

// tri par tas
// O(n log n)
public class HeapSort extends Sorting {

	// recursive version of moveDown
	private void moveDownRec(int[] array, int k, int v, int n) {
		int r = 2 * k + 1;
		if (r >= n)
			array[k] = v;
		else {
			if (r + 1 < n && array[r] < array[r + 1])
				r++;
			if (array[r] <= v)
				array[k] = v;
			else {
				array[k] = array[r];
				moveDownRec(array, r, v, n);
			}
		}
	}

	private void moveDown(int[] array, int fromHalfIndex, int valueFromHalfIndex, int length) {
		int currentIndex = fromHalfIndex;
		while (true) {
			int index = 2 * currentIndex + 1;
			if (index >= length)
				break;
			if (index + 1 < length && array[index] < array[index + 1])
				index++;
			if (array[index] <= valueFromHalfIndex)
				break;
			array[currentIndex] = array[index];
			currentIndex = index;
		}
		array[currentIndex] = valueFromHalfIndex;
	}

	public void heapSort(int[] array) {
		int length = array.length;
		for (int fromHalfIndex = length / 2 - 1; fromHalfIndex >= 0; fromHalfIndex--)
			moveDown(array, fromHalfIndex, array[fromHalfIndex], length);
		for (int k = length - 1; k >= 1; k--) {
			int v = array[k];
			array[k] = array[0];
			moveDown(array, 0, v, k);
		}
	}

}