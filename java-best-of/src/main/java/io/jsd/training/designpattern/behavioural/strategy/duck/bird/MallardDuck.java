package io.jsd.training.designpattern.behavioural.strategy.duck.bird;

import io.jsd.training.designpattern.behavioural.strategy.duck.behaviour.fly.FlyWithWings;
import io.jsd.training.designpattern.behavioural.strategy.duck.behaviour.quack.Quack;

public class MallardDuck extends Duck {

	// Constructor assign a behaviour implemented to behaviour interfaced in extended Class Duck
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
