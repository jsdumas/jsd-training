package io.jsd.training.designpatterns.hf.combining.adapter.bird;

public class MallardDuck implements Quackable {
	@Override
	public void quack() {
		System.out.println("Quack");
	}
}
