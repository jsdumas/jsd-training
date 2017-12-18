package io.jsd.training.java.guava.collect;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

public class OrderingTest {
	
	private final static List<String> RANDOM = Lists.newArrayList(null, "welcome", "to", "leveluplunch", null, null);
	private List<Integer> numbers;
	private Comparator<String> byLength;

	
	@Before
	public void setUp() {
	    numbers = Lists.newArrayList(6, 4, 8, 6, 2, 3);
	    byLength = new Comparator<String>() {
		    public int compare(String left, String right) {
		        return Integer.compare(left.length(), right.length());
		    }
		};
	}
	
	@Test
	public void whenCollectionSortThenListNumberIsOrdered() {
	    Collections.sort(numbers, Ordering.natural());
	    System.out.println(numbers);
	    assertThat(numbers, equalTo(Lists.newArrayList(2,3,4,6,6,8)));
	}
	
	@Test
	public void whenCollectionSortReverseThenListNumberIsreversed() {
	    Collections.sort(numbers, Ordering.natural().reversed());
	    System.out.println(numbers);
	    assertThat(numbers, equalTo(Lists.newArrayList(8,6,6,4,3,2)));
	}
	
	@Test
	public void whenCollectionSortGetMaxThenWeGetMax() {
	    Integer maxValue = Ordering.natural().max(numbers);
	    assertThat(maxValue, equalTo(8));
	}
	
	@Test
	public void whenCollectionSortGetMinThenWeGetMin() {
	    Integer minValue = Ordering.natural().min(numbers);
	    assertThat(minValue, equalTo(2));
	}
	
	@Test
	public void whenCollectionIsSortedWhithLengthComparatorThenListIsOrderedByLength() {
	    List<String> random = Lists.newArrayList("welcome", "to", "leveluplunch");
	    Comparator<String> reversedByLength = Ordering.from(byLength).reversed();
	    Collections.sort(random, reversedByLength);
	    System.out.println(random);
	    assertThat(random, contains("leveluplunch", "welcome", "to"));
	}
	
	@Test
	public void whenCollectionIsNotOrderedThenReturnfalse() {
	    List<String> random = Lists.newArrayList("welcome", "to", "leveluplunch");
	    Comparator<String> reversedByLength = Ordering.from(byLength).reversed();
	    System.out.println(random);
	    assertThat(Ordering.from(reversedByLength).isOrdered(random), is(false));
	}
	
	@Test
	public void whenCollectionIsOrderedWithNullLasOfThenReturnCollectionOrderedWithNullAtEnd() {
	    System.out.println(Ordering.from(byLength).nullsLast().sortedCopy(RANDOM));
	    assertThat(Ordering.from(byLength).nullsLast().sortedCopy(RANDOM), Matchers.contains("to","welcome", "leveluplunch", null, null, null));
	}
	
	@Test
	public void whenCollectionIsOrderedWithNullFirstOfThenReturnCollectionOrderedWithNullAtFirst() {
	    System.out.println(Ordering.from(byLength).nullsLast().sortedCopy(RANDOM));
	    assertThat(Ordering.from(byLength).nullsFirst().sortedCopy(RANDOM), Matchers.contains(null,null,null,"to","welcome", "leveluplunch"));
	}
	
	@Test
	public void orderingRandomShouldReturnTheTwoFirstOrderedItems() {
		List<String> sortedList = Ordering.from(byLength).nullsLast().leastOf(RANDOM, 2);
		System.out.println(sortedList);
		assertThat(sortedList, contains("to","welcome"));
	}
	

}
