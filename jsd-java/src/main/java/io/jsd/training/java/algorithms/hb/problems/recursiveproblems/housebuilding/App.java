package io.jsd.training.java.algorithms.hb.problems.recursiveproblems.housebuilding;

public class App {

	public static void main(String[] args) {
		HouseBuilding algorithm = new HouseBuilding();
		algorithm.runSlow(4);
		System.out.println("");
		System.out.println("#");
		System.out.println("");
		algorithm.runFast(4);
	}
}
