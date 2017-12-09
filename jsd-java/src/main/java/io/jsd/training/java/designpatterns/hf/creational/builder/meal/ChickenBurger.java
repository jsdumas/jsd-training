package io.jsd.training.java.designpatterns.hf.creational.builder.meal;


public class ChickenBurger extends Burger {

	@Override
	public float price() {
		return 50.5f;
	}

	@Override
	public String name() {
		return "Chicken Burger";
	}

}
