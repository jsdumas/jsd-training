package io.jsd.training.designpatterns.hf.behavioural.strategy.duck.behaviour.quack;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
