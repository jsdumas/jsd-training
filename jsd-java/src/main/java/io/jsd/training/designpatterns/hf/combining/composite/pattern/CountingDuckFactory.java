package io.jsd.training.designpatterns.hf.combining.composite.pattern;

import io.jsd.training.designpatterns.hf.combining.composite.bird.DuckCall;
import io.jsd.training.designpatterns.hf.combining.composite.bird.MallardDuck;
import io.jsd.training.designpatterns.hf.combining.composite.bird.Quackable;
import io.jsd.training.designpatterns.hf.combining.composite.bird.RedheadDuck;
import io.jsd.training.designpatterns.hf.combining.composite.bird.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}

	@Override
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	@Override
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}
}
