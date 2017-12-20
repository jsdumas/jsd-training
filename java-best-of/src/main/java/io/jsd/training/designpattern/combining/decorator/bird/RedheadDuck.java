package io.jsd.training.designpattern.combining.decorator.bird;

public class RedheadDuck implements Quackable {
	@Override
	public void quack() {
		System.out.println("Quack");
	}
}
