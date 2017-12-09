package io.jsd.training.designpatterns.hf.behavioural.decorator.starbuzz.pattern;

import io.jsd.training.designpatterns.hf.behavioural.decorator.starbuzz.beverage.Beverage;

public class Milk extends CondimentDecorator {
	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
