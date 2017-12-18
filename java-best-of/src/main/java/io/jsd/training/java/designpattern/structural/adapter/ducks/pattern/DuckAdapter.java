package io.jsd.training.java.designpattern.structural.adapter.ducks.pattern;

import java.util.Random;

import io.jsd.training.java.designpattern.structural.adapter.ducks.bird.Duck;
import io.jsd.training.java.designpattern.structural.adapter.ducks.bird.Turkey;

public class DuckAdapter implements Turkey {
	Duck duck;
	Random rand;

	public DuckAdapter(Duck duck) {
		this.duck = duck;
		rand = new Random();
	}

	@Override
	public String gobble() {
		return duck.quack();
	}

	@Override
	public String fly() {
		if (rand.nextInt(5) == 0) {
			duck.fly();
		}
		return duck.fly();
	}
}
