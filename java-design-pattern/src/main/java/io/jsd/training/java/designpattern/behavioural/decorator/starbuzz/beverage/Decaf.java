package io.jsd.training.java.designpattern.behavioural.decorator.starbuzz.beverage;


public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}

