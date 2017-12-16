package io.jsd.training.java.designpattern.creational.factory.pizzastylebystore.store;

import io.jsd.training.java.designpattern.creational.factory.pizzastylebystore.pizza.ChicagoStyleCheesePizza;
import io.jsd.training.java.designpattern.creational.factory.pizzastylebystore.pizza.ChicagoStyleClamPizza;
import io.jsd.training.java.designpattern.creational.factory.pizzastylebystore.pizza.ChicagoStylePepperoniPizza;
import io.jsd.training.java.designpattern.creational.factory.pizzastylebystore.pizza.ChicagoStyleVeggiePizza;
import io.jsd.training.java.designpattern.creational.factory.pizzastylebystore.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new ChicagoStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new ChicagoStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		} else
			return null;
	}
}
