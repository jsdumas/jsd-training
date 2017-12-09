package test.io.jsd.training.java.algorithms.practice.sorting;

import org.junit.Test;

import io.jsd.training.java.algorithms.practice.sorting.SelectionSort;

public class SelectionSortTest extends ArrayTest {

	@Test
	public void shouldNotBeSorted() {
		isSorted(super.array, false);
	}

	@Test
	public void shouldBeSorted() {
		int[] array = super.array;
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.selectionSort(array);
		isSorted(array, true);
		System.out.print(selectionSort.getTimeExec());
	}

}
