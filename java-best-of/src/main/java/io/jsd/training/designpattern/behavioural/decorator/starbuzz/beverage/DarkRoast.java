package io.jsd.training.designpattern.behavioural.decorator.starbuzz.beverage;


public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

