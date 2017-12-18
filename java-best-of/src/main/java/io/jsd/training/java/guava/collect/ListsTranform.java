package io.jsd.training.java.guava.collect;

import java.util.List;

import com.google.common.base.Function;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

public class ListsTranform {
	
	public static void main(String[] args) {
	// Given words list
	List<String> words = Splitter.onPattern(" ").splitToList( "Lorem ipsum dolor sit amet consectetur adipisicing elit");
	 
	//Go through a list of objects
	// Lists.transform returns a list that applies function to each
	// element of collection. The returned list is a transformed view
	// of input list.
	List<String> transformedWords = Lists.transform(
	        words,
	        //Anonymous class
	        new Function<String, String>() {
	            @Override
	            public String apply(String input) {
	                return input.toUpperCase().substring(0, 3);
	            }
	        }
	);
	 
	System.out.println(transformedWords);
	        // -> [LOR, IPS, DOL, SIT, AME, CON, ADI, ELI]
	}

}
