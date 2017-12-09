package io.jsd.training.designpatterns.hf.combining.composite.pattern;

import io.jsd.training.designpatterns.hf.combining.composite.bird.Quackable;

public abstract class AbstractDuckFactory {

	public abstract Quackable createMallardDuck();

	public abstract Quackable createRedheadDuck();

	public abstract Quackable createDuckCall();

	public abstract Quackable createRubberDuck();
}
