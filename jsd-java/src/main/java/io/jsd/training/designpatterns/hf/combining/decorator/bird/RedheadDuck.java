package io.jsd.training.designpatterns.hf.combining.decorator.bird;

public class RedheadDuck implements Quackable {
	@Override
	public void quack() {
		System.out.println("Quack");
	}
}
