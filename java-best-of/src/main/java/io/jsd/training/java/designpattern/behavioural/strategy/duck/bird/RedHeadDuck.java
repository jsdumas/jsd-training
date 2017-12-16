package io.jsd.training.java.designpattern.behavioural.strategy.duck.bird;

import io.jsd.training.java.designpattern.behavioural.strategy.duck.behaviour.fly.FlyWithWings;
import io.jsd.training.java.designpattern.behavioural.strategy.duck.behaviour.quack.Quack;

public class RedHeadDuck extends Duck {

	// Constructor assign a behaviour implemented to behaviour interfaced in extended Class Duck
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
