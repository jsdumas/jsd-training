package test.io.jsd.training.practice.sorting;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Random;

public abstract class ArrayTest {

	protected static final int LENGTH = 30000;
	protected int[] array = initArray();

	private int[] initArray() {
		Random random = new Random();
		int[] array = new int[LENGTH];
		for (int i = 0; i < LENGTH; i++)
			array[i] = random.nextInt(100);
		return array;
	}

	protected void isSorted(int[] array, boolean isSorted) {
		for (int i = 0; i < array.length - 1; i++) {
			boolean isSmaller = array[i] <= array[i + 1];
			assertThat(isSmaller, is(isSorted));
			if (isSmaller)
				continue;
			break;
		}
	}

}
