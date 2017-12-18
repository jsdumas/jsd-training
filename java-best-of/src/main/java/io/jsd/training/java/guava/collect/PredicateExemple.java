package io.jsd.training.java.guava.collect;

import java.util.Collection;
import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

public class PredicateExemple {
	
	public static void main(String[] args) {
	
		Predicate<String> predicate = new Predicate<String>() {
	        @Override
	        public boolean apply(String input) {
	            return input.startsWith("A") || input.startsWith("J");
	        }
	    };
	 
	    List<String> names = Lists.newArrayList("John", "Jane", "Adam", "Tom");
	    Collection<String> result = Collections2.filter(names, predicate);
	    
	    System.out.println(result);
	}

}
