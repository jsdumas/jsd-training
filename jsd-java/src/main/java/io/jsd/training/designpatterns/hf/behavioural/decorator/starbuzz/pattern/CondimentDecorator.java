package io.jsd.training.designpatterns.hf.behavioural.decorator.starbuzz.pattern;

import io.jsd.training.designpatterns.hf.behavioural.decorator.starbuzz.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}
