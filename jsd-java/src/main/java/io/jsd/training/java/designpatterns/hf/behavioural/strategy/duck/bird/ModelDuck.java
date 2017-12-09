package io.jsd.training.java.designpatterns.hf.behavioural.strategy.duck.bird;

import io.jsd.training.java.designpatterns.hf.behavioural.strategy.duck.behaviour.fly.FlyNoWay;
import io.jsd.training.java.designpatterns.hf.behavioural.strategy.duck.behaviour.quack.Quack;

public class ModelDuck extends Duck {

	// Constructor assign a behaviour implemented to behaviour interfaced in extended Class Duck
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}
}
