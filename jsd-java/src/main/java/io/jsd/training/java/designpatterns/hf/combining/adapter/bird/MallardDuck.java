package io.jsd.training.java.designpatterns.hf.combining.adapter.bird;

public class MallardDuck implements Quackable {
	@Override
	public void quack() {
		System.out.println("Quack");
	}
}
