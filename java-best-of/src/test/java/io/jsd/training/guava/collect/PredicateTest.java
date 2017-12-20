package io.jsd.training.guava.collect;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

import java.util.Collection;
import java.util.List;

import org.junit.Test;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

public class PredicateTest {
	
	private final List<String> names = Lists.newArrayList("John", "Jane", "Adam", "Tom");
	
	@Test
	public void whenListNameIsSortedWithNamesWhichContainAandJThenListPrintOnlyThreeNamesOutOfFour() {
		Predicate<String> predicate = new Predicate<String>() {
	        @Override
	        public boolean apply(String input) {
	            return input.startsWith("A") || input.startsWith("J");
	        }
	    };
	    Collection<String> result = Collections2.filter(names, predicate);
	    System.out.println(result);
	    assertThat(result, contains("John","Jane","Adam"));
	}

}
