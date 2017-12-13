package io.jsd.training.java.algorithm.hb.problems.recursiveproblems.towersofhanoi;

import java.util.Stack;

public class Rod {

	private final Position position;
	private Stack<Plate> plates;

	public Rod(Position position) {
		this.position = position;
		this.plates = new Stack<Plate>();
	}

	public Position getPosition() {
		return position;
	}

	public Stack<Plate> getPlates() {
		return plates;
	}

	public void setPlates(Stack<Plate> plates) {
		this.plates = plates;
	}

}
