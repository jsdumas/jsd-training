package io.jsd.training.java.designpatterns.hf.combining.factory.pattern;

import io.jsd.training.java.designpatterns.hf.combining.factory.bird.Quackable;

public class QuackCounter implements Quackable {
	Quackable duck;
	static int numberOfQuacks;

	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}

	@Override
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}

	public static int getQuacks() {
		return numberOfQuacks;
	}

	@Override
	public String toString() {
		return duck.toString();
	}
}
