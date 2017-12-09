package io.jsd.training.java.designpatterns.hf.combining.composite.bird;

public class MallardDuck implements Quackable {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

	@Override
	public String toString() {
		return "Mallard Duck";
	}
}
