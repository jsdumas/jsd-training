package io.jsd.training.algorithms.practice.memo;

import java.util.HashMap;

// suite de Fibonacci

public class Fib {

	// m�mo�sation
	private final HashMap<Integer, Long> memo = new HashMap<Integer, Long>();

	public long fibonacci(int value) {
		if (value <= 1)
			return value;
		return fibonacci(value - 2) + fibonacci(value - 1);
	}

	// static { memo.put(0, 0L); memo.put(1, 1L); }
	public long fibMemo(int n) {
		// if (n <= 1) return n;
		Long l = memo.get(n);
		if (l != null)
			return l;
		if (n <= 1)
			l = (long) n;
		else
			l = fibMemo(n - 2) + fibMemo(n - 1);
		memo.put(n, l);
		return l;
	}

	// programmation dynamique
	public long fibDP(int n) {
		long[] f = new long[n + 1];
		f[1] = 1;
		for (int i = 2; i <= n; i++)
			f[i] = f[i - 2] + f[i - 1];
		return f[n];
	}

	// et avec deux entiers seulement
	public long fibDP2(int n) {
		int a = 0, b = 1; // a = F(k), b = F(k+1)
		while (n-- > 0) {
			b = b + a;
			a = b - a;
		}
		return a;
	}
}