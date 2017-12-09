package io.jsd.training.designpatterns.hf.behavioural.decorator.starbuzz.beverage;


public class Espresso extends Beverage {
  
	public Espresso() {
		description = "Espresso";
	}
  
	public double cost() {
		return 1.99;
	}
}

