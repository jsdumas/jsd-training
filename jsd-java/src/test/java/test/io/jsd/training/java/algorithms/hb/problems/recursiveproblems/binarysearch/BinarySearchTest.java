package test.io.jsd.training.java.algorithms.hb.problems.recursiveproblems.binarysearch;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

import io.jsd.training.java.algorithms.hb.problems.recursiveproblems.binarysearch.BinarySearch;

public class BinarySearchTest {

	private static final int[] SORTED_ARRAY = { 1, 5, 6, 8, 13, 22, 26, 40, 50, 57, 60 };
	private static final int[] UNSORTED_ARRAY = { 5, 1, 40, 8, 57, 22, 60, 6, 50, 13, 26 };
	private static final BinarySearch BINARY_SEARCH_OF_SORTED_ARRAY = new BinarySearch(SORTED_ARRAY);
	private static final BinarySearch BINARY_SEARCH_OF_UNSORTED_ARRAY = new BinarySearch(UNSORTED_ARRAY);
	private static final int VALUE_8 = 8;
	private static final int INDEX_3 = 3;
	private static final int VALUE_NOT_FOUND = 100;
	private static final int INDEX_NOT_FOUND = -1;

	@Test
	public void linearSearchOf_8_shouldReturn_3_index() {
		assertThat(BINARY_SEARCH_OF_SORTED_ARRAY.linearSearch(VALUE_8), equalTo(INDEX_3));
	}

	@Test
	public void binarySearchOf_8_shouldReturn_3_index() {
		assertThat(BINARY_SEARCH_OF_SORTED_ARRAY.binarySearch(VALUE_8), equalTo(INDEX_3));
	}

	@Test
	public void linearSearchOf_100_shouldReturnMinus_1_index() {
		assertThat(BINARY_SEARCH_OF_SORTED_ARRAY.linearSearch(VALUE_NOT_FOUND), equalTo(INDEX_NOT_FOUND));
	}

	@Test
	public void binarySearchOf_100_shouldReturnMinus_1_index() {
		assertThat(BINARY_SEARCH_OF_SORTED_ARRAY.binarySearch(VALUE_NOT_FOUND), equalTo(INDEX_NOT_FOUND));
	}

	@Test
	public void linearSearchOfUnsortedArray_8_shouldReturn_3_index() {
		assertThat(BINARY_SEARCH_OF_UNSORTED_ARRAY.linearSearch(VALUE_8), equalTo(INDEX_3));
	}

	@Test
	public void binarySearchOfUnsortedArray_8_shouldReturn_3_index() {
		assertThat(BINARY_SEARCH_OF_UNSORTED_ARRAY.binarySearch(VALUE_8), equalTo(INDEX_NOT_FOUND));
	}

}
