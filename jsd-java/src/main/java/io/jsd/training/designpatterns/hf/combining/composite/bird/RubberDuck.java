package io.jsd.training.designpatterns.hf.combining.composite.bird;

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
