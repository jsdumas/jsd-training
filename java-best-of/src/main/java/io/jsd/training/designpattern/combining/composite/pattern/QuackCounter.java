package io.jsd.training.designpattern.combining.composite.pattern;

import io.jsd.training.designpattern.combining.composite.bird.Quackable;

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
