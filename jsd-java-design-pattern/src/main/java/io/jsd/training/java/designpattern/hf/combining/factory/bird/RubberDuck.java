package io.jsd.training.java.designpattern.hf.combining.factory.bird;

public class RubberDuck implements Quackable {

	@Override
	public void quack() {
		System.out.println("Squeak");
	}

	@Override
	public String toString() {
		return "Rubber Duck";
	}
}
