package io.jsd.training.guava.collect;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.Test;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

public class IterablesAndIteratorsTest {
	
	private final List<Integer> nombres = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
	private final List<Integer> nombresPairs = Arrays.asList(0, 2, 4, 6, 8);
	 
	private final Predicate<Integer> isNombrePair = new Predicate<Integer>() {
		public boolean apply(Integer number) {
			return number % 2 == 0;
		}
	};
	 
	@Test
	public void usingPredicates() {
		// Tous les nombres sont pairs ?
		assertThat(Iterables.all(nombres, isNombrePair), is(false));
		assertThat(Iterables.all(nombresPairs, isNombrePair), is(true));
	 
		// Au moins un des nombres est pair ?
		assertThat(Iterables.any(nombres, isNombrePair), is(true));
		assertThat(Iterables.any(nombresPairs, isNombrePair), is(true));
	 
		// Filtrage et égalité
		Iterable<Integer> filteredNumbers = Iterables.filter(nombres, isNombrePair);
		assertThat(Iterables.elementsEqual(nombresPairs, filteredNumbers), is(true));
	}
	 
	@Test
	public void search() {
		// Contains
		assertThat(Iterables.contains(nombres, -1), is(false));
		assertThat(Iterables.contains(nombres, 1), is(true));
	 
		// Find
		Integer firstMatchingElement = Iterables.find(nombres, isNombrePair);
		assertThat(firstMatchingElement, Matchers.notNullValue());
		assertThat(firstMatchingElement.intValue(), equalTo(0));
	 
		// IndexOf
		int firstMatchingIndex = Iterables.indexOf(nombres, isNombrePair);
		assertThat(firstMatchingIndex, equalTo(0));
	}
	 
	@Test
	public void iteration() {
		List<Integer> nombres = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
		int limit = 3;
	 
		// Limited iteration
		Iterable<Integer> limited = Iterables.limit(nombres, limit);
		Iterator<Integer> limitedIterator = limited.iterator();
		for (int i = 0; i < limit; i++) {
			assertThat(limitedIterator.hasNext(), is(true));
			limitedIterator.next();
		}
		assertThat(limitedIterator.hasNext(), is(false));
	 
		// Unlimited iteration
		Iterable<Integer> cycling = Iterables.cycle(nombres);
		Iterator<Integer> cyclingIterator = cycling.iterator();
		for (int i = 0; i < 10 * nombres.size(); i++) {
			assertThat(cyclingIterator.hasNext(), is(true));
			cyclingIterator.next();
		}
	}
	 
	@Test
	public void size() {
		assertThat(Iterables.isEmpty(nombres), is(false));
		assertThat(Iterables.size(nombres), equalTo(nombres.size()));
	}

}
