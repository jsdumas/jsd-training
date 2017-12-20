package io.jsd.training.designpattern.behavioural.strategy.duck.behaviour.fly;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}
