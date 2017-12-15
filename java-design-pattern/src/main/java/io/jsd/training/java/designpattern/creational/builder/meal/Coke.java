package io.jsd.training.java.designpattern.creational.builder.meal;


public class Coke extends ColdDrink {

	@Override
	public float price() {
		return 30.0f;
	}

	@Override
	public String name() {
		return "Coke";
	}

}