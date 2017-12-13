package io.jsd.training.java.designpattern.hf.combining.adapter.bird;

public class RubberDuck implements Quackable {
	@Override
	public void quack() {
		System.out.println("Squeak");
	}
}
