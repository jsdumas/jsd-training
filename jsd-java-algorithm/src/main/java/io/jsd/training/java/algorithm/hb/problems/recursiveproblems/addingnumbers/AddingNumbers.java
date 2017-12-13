package io.jsd.training.java.algorithm.hb.problems.recursiveproblems.addingnumbers;

import io.jsd.training.java.algorithm.hb.problems.recursiveproblems.Algorithm;

public class AddingNumbers implements Algorithm {

	//Slower than iteration because recursion use operating system stack memory
	//recursive push information first and then pop information from  stack
	private int sumRecursive(int number){
		if( number == 1 ) return 1;
		return number + sumRecursive(number-1);
	}
	
	private int sumIterative(int number){
		int result = 0;
		for(int i=1;i<=number;++i){
			result += i;
		}
		return result;
	}

	@Override
	public int runFast(int number) {
		return sumIterative(number);
	}

	@Override
	public int runSlow(int number) {
		return sumRecursive(number);
	}
}
