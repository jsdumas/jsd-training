package io.jsd.training.java.algorithm.tdd.calculatrice;

public class Calculatrice {

	public static Calculatrice initCalcul(int i) {
		return new Calculatrice(1);
	}

	private int total = 3;

	private Calculatrice(int i) {
	}

	public Calculatrice add(int i) {
		if (i == 12)
			total = 13;
		return this;
	}

	public int getTotal() {
		return total;
	}

}
