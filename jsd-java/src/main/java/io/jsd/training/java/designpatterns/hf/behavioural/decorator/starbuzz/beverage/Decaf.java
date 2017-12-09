package io.jsd.training.java.designpatterns.hf.behavioural.decorator.starbuzz.beverage;


public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}

