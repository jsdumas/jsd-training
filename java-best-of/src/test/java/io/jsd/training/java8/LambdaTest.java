package io.jsd.training.java8;

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
		MatcherAssert.assertThat(difference.calculer(5, 5), Matchers.equalTo(0));
	}
	
	@Test 
	public void when5PlusThenEquals10(){
		MatcherAssert.assertThat(addition.calculer(5, 5), Matchers.equalTo(10));
	}
	
	@Test 
	public void when5divise5ThenEquals1(){
		MatcherAssert.assertThat(division.calculer(5, 5), Matchers.equalTo(1));
	}
	
	@Test 
	public void when5Multiplie5ThenEquals25(){
		MatcherAssert.assertThat(multiplication.calculer(5, 5), Matchers.equalTo(25));
	}

}
