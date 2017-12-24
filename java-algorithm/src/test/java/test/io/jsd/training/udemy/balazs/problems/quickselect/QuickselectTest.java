package test.io.jsd.training.udemy.balazs.problems.quickselect;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

import java.util.Arrays;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import io.jsd.training.udemy.balazs.problems.quickselect.Quickselect;

public class QuickselectTest {

	private static final Integer[] ARRAY = new Integer[] { 5, 99, 1, 789 };
	private static final Quickselect QUICK_SELECT = new Quickselect(ARRAY);

	@Test
	public void shoulReturnTheSecondLargestNumberInArrayWhichIs96() {
		MatcherAssert.assertThat(QUICK_SELECT.select(2), equalTo(99));
	}

	@Test
	public void shouldReturnDescendingItemOfArray() {
		MatcherAssert.assertThat(Arrays.asList(QUICK_SELECT.getNums()), contains(789, 99, 5, 1));
	}
}
