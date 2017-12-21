package io.jsd.training.java8;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

import java.util.Arrays;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class LambdaTest {

	interface Operation {
		public Integer calculer(Integer x, Integer y);
	}
	
	Operation difference = (x,y)->x-y;
	Operation division = (x,y)-> {
		if(y==0 || x==0) {
			return 0;
		} else {
			return x/y;
		}
	};
	Operation addition = (x,y)->x+y;
	Operation multiplication = (x,y)->x*y;

	@Test 
	public void when5Moins5ThenEquals0(){
		assertThat(difference.calculer(5, 5), equalTo(0));
	}
	
	@Test 
	public void when5PlusThenEquals10(){
		assertThat(addition.calculer(5, 5), equalTo(10));
	}
	
	@Test 
	public void when5divise5ThenEquals1(){
		assertThat(division.calculer(5, 5), equalTo(1));
	}
	
	@Test 
	public void when5Multiplie5ThenEquals25(){
		assertThat(multiplication.calculer(5, 5), equalTo(25));
	}
	
	@Test
	public void whenThen() {
		String[] myArray = {"one", "two", "three", "four"};
		//compareToIgnoreCase is a method of String instance
		Arrays.sort(myArray, String::compareToIgnoreCase);
		assertThat(Arrays.asList(myArray), contains("four", "one", "three", "two" ));
	}
	
}
