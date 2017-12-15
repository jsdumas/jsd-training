package io.jsd.training.java.designpattern.creational.factory.pizzafactory.pattern;

import io.jsd.training.java.designpattern.creational.factory.pizzafactory.pizza.CheesePizza;
import io.jsd.training.java.designpattern.creational.factory.pizzafactory.pizza.ClamPizza;
import io.jsd.training.java.designpattern.creational.factory.pizzafactory.pizza.PepperoniPizza;
import io.jsd.training.java.designpattern.creational.factory.pizzafactory.pizza.Pizza;
import io.jsd.training.java.designpattern.creational.factory.pizzafactory.pizza.VeggiePizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
