package io.jsd.training.designpattern.creational.factory.pizzafactory.store;

import io.jsd.training.designpattern.creational.factory.pizzafactory.pattern.SimplePizzaFactory;
import io.jsd.training.designpattern.creational.factory.pizzafactory.pizza.Pizza;

public class PizzaStore {
	SimplePizzaFactory factory;

	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	public Pizza orderPizza(String type) {
		Pizza pizza;

		pizza = factory.createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
