package io.jsd.training.java.designpattern.hf.creational.factory.pizzastylebystore.store;

import io.jsd.training.java.designpattern.hf.creational.factory.pizzastylebystore.pizza.Pizza;

public abstract class PizzaStore {

	abstract Pizza createPizza(String item);

	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
