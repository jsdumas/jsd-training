package io.jsd.training.java.designpattern.hf.behavioural.decorator.starbuzz.beverage;


public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}
