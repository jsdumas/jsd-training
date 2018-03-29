package io.jsd.training.udemy.balazs.problems.dynamicprogramming.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class FibonacciAlgorithm {

	private Map<Integer, Integer> memoizeTable; // O(1)

	public FibonacciAlgorithm() {
		this.memoizeTable = new HashMap<>();
		this.memoizeTable.put(0, 0);
		this.memoizeTable.put(1, 1);
	}

	public int fibonacciMemoize(int number) {

		// if memoizeTable contains this key, then return value.
		if (this.memoizeTable.containsKey(number))
			return this.memoizeTable.get(number);

		// else numbers from number - 1 and -2 are memorized in table.
		this.memoizeTable.put(number - 1, fibonacciMemoize(number - 1));
		this.memoizeTable.put(number - 2, fibonacciMemoize(number - 2));

		// after this, we calculate new value of current key with adding two previous
		// number.
		int calculatedNumber = this.memoizeTable.get(number - 1) + this.memoizeTable.get(number - 2);
		// we memorized current key and value.
		this.memoizeTable.put(number, calculatedNumber);

		// finally we return the last calculated number.
		return calculatedNumber;

	}

	public int naiveFibonacci(int number) {

		if (number == 0)
			return 0;
		if (number == 1)
			return 1;

		return (naiveFibonacci(number - 1) + naiveFibonacci(number - 2));
	}
}
