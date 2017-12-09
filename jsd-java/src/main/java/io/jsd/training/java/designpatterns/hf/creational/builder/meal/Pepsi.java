package io.jsd.training.java.designpatterns.hf.creational.builder.meal;

public class Pepsi extends ColdDrink {

	@Override
	public float price() {
		return 35.0f;
	}

	@Override
	public String name() {
		return "Pepsi";
	}

}
