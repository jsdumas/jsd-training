package io.jsd.training.designpattern.combining.observer.pattern;

import io.jsd.training.designpattern.combining.observer.bird.DuckCall;
import io.jsd.training.designpattern.combining.observer.bird.MallardDuck;
import io.jsd.training.designpattern.combining.observer.bird.Quackable;
import io.jsd.training.designpattern.combining.observer.bird.RedheadDuck;
import io.jsd.training.designpattern.combining.observer.bird.RubberDuck;

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
