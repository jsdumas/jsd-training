package io.jsd.training.java.designpattern.behavioural.decorator.starbuzz.pattern;

import io.jsd.training.java.designpattern.behavioural.decorator.starbuzz.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}
