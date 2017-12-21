package io.jsd.training.designpattern.combining.adapter.bird;

public class RedheadDuck implements Quackable {
	@Override
	public void quack() {
		System.out.println("Quack");
	}
}
