package io.jsd.training.java.guava.collection;

import java.util.Comparator;
import java.util.List;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

public class OrderingExemple {

	public static void main(String[] args) {
		
		Comparator<String> byLength = new Comparator<String>() {
		    public int compare(String left, String right) {
		        return Integer.compare(left.length(), right.length());
		    }
		};

		List<String> random = Lists.newArrayList(null, "welcome", "to", "leveluplunch", null, null);

		
		List<String> firstTwo = Ordering.from(byLength).nullsLast().leastOf(random, 2);

		System.out.println(firstTwo);
	}

}
