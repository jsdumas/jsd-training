package io.jsd.training.java.designpattern.combining.factory.pattern;

import io.jsd.training.java.designpattern.combining.factory.bird.Quackable;

public abstract class AbstractDuckFactory {

	public abstract Quackable createMallardDuck();

	public abstract Quackable createRedheadDuck();

	public abstract Quackable createDuckCall();

	public abstract Quackable createRubberDuck();
}