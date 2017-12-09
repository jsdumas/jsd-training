package io.jsd.training.designpatterns.hf.creational.builder.meal;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
