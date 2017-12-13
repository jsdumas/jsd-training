package io.jsd.training.java.designpattern.hf.combining.composite.bird;

public class RedheadDuck implements Quackable {
	@Override
	public void quack() {
		System.out.println("Quack");
	}

	@Override
	public String toString() {
		return "Redhead Duck";
	}
}
