package io.jsd.training.java.algorithms.hb.problems.recursiveproblems.towersofhanoi;

public enum Position {

	FROM("A"), MIDDLE("B"), TO("C");

	private final String value;

	private Position(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
