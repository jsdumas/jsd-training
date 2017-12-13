package io.jsd.training.java.designpattern.hf.behavioural.strategy.duck.behaviour.quack;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
