package io.jsd.training.java.designpatterns.hf.behavioural.templatemethod.sort;

public class Duck implements Comparable {

	private final String name;
	private final int weight;

	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	@Override
	public int compareTo(Object object) {

		Duck otherDuck = (Duck) object;

		if (this.weight < otherDuck.weight) {
			return -1;
		} else if (this.weight == otherDuck.weight) {
			return 0;
		} else { // this.weight > otherDuck.weight
			return 1;
		}
	}

	@Override
	public String toString() {
		return name + " weighs " + weight;
	}
}
