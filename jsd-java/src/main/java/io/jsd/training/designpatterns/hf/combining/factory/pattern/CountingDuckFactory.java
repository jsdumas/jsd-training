package io.jsd.training.designpatterns.hf.combining.factory.pattern;

import io.jsd.training.designpatterns.hf.combining.factory.bird.DuckCall;
import io.jsd.training.designpatterns.hf.combining.factory.bird.MallardDuck;
import io.jsd.training.designpatterns.hf.combining.factory.bird.Quackable;
import io.jsd.training.designpatterns.hf.combining.factory.bird.RedheadDuck;
import io.jsd.training.designpatterns.hf.combining.factory.bird.RubberDuck;

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
