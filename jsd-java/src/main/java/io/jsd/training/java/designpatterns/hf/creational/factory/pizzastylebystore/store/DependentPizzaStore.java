package io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystore.store;

import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystore.pizza.ChicagoStyleCheesePizza;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystore.pizza.ChicagoStyleClamPizza;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystore.pizza.ChicagoStylePepperoniPizza;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystore.pizza.ChicagoStyleVeggiePizza;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystore.pizza.NYStyleCheesePizza;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystore.pizza.NYStyleClamPizza;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystore.pizza.NYStylePepperoniPizza;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystore.pizza.NYStyleVeggiePizza;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystore.pizza.Pizza;

public class DependentPizzaStore {

	public Pizza createPizza(String style, String type) {
		Pizza pizza = null;
		if (style.equals("NY")) {
			if (type.equals("cheese")) {
				pizza = new NYStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new NYStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new NYStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new NYStylePepperoniPizza();
			}
		} else if (style.equals("Chicago")) {
			if (type.equals("cheese")) {
				pizza = new ChicagoStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new ChicagoStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new ChicagoStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new ChicagoStylePepperoniPizza();
			}
		} else {
			System.out.println("Error: invalid type of pizza");
			return null;
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
