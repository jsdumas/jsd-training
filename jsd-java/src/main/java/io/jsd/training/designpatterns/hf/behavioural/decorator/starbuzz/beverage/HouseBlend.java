package io.jsd.training.designpatterns.hf.behavioural.decorator.starbuzz.beverage;


public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
 
	public double cost() {
		return .89;
	}
}

