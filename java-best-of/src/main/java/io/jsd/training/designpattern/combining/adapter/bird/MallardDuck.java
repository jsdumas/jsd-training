package io.jsd.training.designpattern.combining.adapter.bird;

public class MallardDuck implements Quackable {
	@Override
	public void quack() {
		System.out.println("Quack");
	}
}
