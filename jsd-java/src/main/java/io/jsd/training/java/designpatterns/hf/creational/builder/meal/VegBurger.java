package io.jsd.training.java.designpatterns.hf.creational.builder.meal;

public class VegBurger extends Burger {

	@Override
	public float price() {
		return 25.0f;
	}

	@Override
	public String name() {
		return "Veg Burger";
	}

}
