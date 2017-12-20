package io.jsd.training.designpattern.combining.factory.pattern;

import io.jsd.training.designpattern.combining.factory.bird.Quackable;

public abstract class AbstractDuckFactory {

	public abstract Quackable createMallardDuck();

	public abstract Quackable createRedheadDuck();

	public abstract Quackable createDuckCall();

	public abstract Quackable createRubberDuck();
}
