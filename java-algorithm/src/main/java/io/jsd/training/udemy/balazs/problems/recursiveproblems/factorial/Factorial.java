package io.jsd.training.udemy.balazs.problems.recursiveproblems.factorial;

import io.jsd.training.udemy.balazs.problems.recursiveproblems.Algorithm;

public class Factorial implements Algorithm {

	//Accumulator parameter allows to avoid poping information from stack.
	//This technique is faster beacause, it returns directly the result without poping
	//that is a kind of memoization
	private int factorialWithMemoization(int accumulator, int n){
		if( n == 1 ) return accumulator;
		return factorialWithMemoization(accumulator*n, n-1);	
	}
	
	
	//Slower than the first method because it does not memorise the result and obliged stack memory system to pop every method call
	private int factorialWithoutMemoization(int n){
		if(n==1) return 1;
		return n * factorialWithoutMemoization(n-1);
	}

	@Override
	public int runFast(int number) {
		return factorialWithMemoization(1, number);
	}

	@Override
	public int runSlow(int number) {
		return factorialWithoutMemoization(number);
	}
}
