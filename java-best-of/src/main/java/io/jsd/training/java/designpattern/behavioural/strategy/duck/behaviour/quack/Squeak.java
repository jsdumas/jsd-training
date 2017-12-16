package io.jsd.training.java.designpattern.behavioural.strategy.duck.behaviour.quack;

public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}
