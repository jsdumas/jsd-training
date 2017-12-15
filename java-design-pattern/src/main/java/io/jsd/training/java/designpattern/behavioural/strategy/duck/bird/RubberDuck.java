package io.jsd.training.java.designpattern.behavioural.strategy.duck.bird;

import io.jsd.training.java.designpattern.behavioural.strategy.duck.behaviour.fly.FlyNoWay;
import io.jsd.training.java.designpattern.behavioural.strategy.duck.behaviour.quack.Squeak;

public class RubberDuck extends Duck {

	// Constructor assign a behaviour implemented to behaviour interfaced in extended Class Duck
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}

	@Override
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
