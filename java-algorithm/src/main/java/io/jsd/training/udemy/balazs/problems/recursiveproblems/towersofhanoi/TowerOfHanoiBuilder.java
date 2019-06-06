package io.jsd.training.udemy.balazs.problems.recursiveproblems.towersofhanoi;

import java.util.Stack;

import io.jsd.training.udemy.balazs.problems.recursiveproblems.towersofhanoi.Plate;
import io.jsd.training.udemy.balazs.problems.recursiveproblems.towersofhanoi.TowerOfHanoi;

public class TowerOfHanoiBuilder {

	private Stack<Plate> plates;

	public TowerOfHanoi build() {
		return new TowerOfHanoi(plates);
	}

	public TowerOfHanoiBuilder withPlate(Plate plate) {
		if (plates == null) {
			plates = new Stack<>();
		}
		plates.push(plate);
		return this;
	}

}
