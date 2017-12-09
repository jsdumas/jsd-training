package io.jsd.training.java.designpatterns.hf.behavioural.strategy.duck.behaviour.quack;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
