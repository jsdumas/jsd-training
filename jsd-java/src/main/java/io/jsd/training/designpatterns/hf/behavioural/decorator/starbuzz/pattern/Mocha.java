package io.jsd.training.designpatterns.hf.behavioural.decorator.starbuzz.pattern;

import io.jsd.training.designpatterns.hf.behavioural.decorator.starbuzz.beverage.Beverage;

public class Mocha extends CondimentDecorator {
	Beverage beverage;
 
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}
