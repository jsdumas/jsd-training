package io.jsd.training.practice.sorting;

import org.junit.Test;

import io.jsd.training.practice.sorting.InsertionSort;

public class InsertionSortTest extends ArrayTest {

	@Test
	public void shouldNotBeSorted() {
		isSorted(super.array, false);
	}

	@Test
	public void shouldBeSorted() {
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.insertionSort(array);
		isSorted(super.array, true);
		System.out.print(insertionSort.getTimeExec());
	}

}
