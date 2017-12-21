package io.jsd.training.designpattern.behavioural.decorator.starbuzz.pattern;

import io.jsd.training.designpattern.behavioural.decorator.starbuzz.beverage.Beverage;

public class Soy extends CondimentDecorator {
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}
