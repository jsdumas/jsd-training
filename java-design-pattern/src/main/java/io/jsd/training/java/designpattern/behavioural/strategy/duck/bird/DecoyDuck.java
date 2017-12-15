package io.jsd.training.java.designpattern.behavioural.strategy.duck.bird;

import io.jsd.training.java.designpattern.behavioural.strategy.duck.behaviour.fly.FlyNoWay;
import io.jsd.training.java.designpattern.behavioural.strategy.duck.behaviour.quack.MuteQuack;

public class DecoyDuck extends Duck {

	// Constructor assign a behaviour implemented to behaviour interfaced in extended Class Duck with setter
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}

	@Override
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
