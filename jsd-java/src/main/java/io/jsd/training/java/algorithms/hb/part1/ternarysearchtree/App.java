package io.jsd.training.java.algorithms.hb.part1.ternarysearchtree;

public class App {

	public static void main(String[] args) {

		TST tst = new TST();

		tst.put("apple", 1);
		tst.put("orange", 2);

		System.out.println(tst.get("math"));

	}
}
