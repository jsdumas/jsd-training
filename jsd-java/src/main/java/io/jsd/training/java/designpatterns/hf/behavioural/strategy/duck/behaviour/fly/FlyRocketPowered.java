package io.jsd.training.java.designpatterns.hf.behavioural.strategy.duck.behaviour.fly;

public class FlyRocketPowered implements FlyBehavior {
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}
}
