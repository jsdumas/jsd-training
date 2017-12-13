package io.jsd.training.java.designpattern.hf.creational.factory.pizzastylebystorefactory.pizza;

import io.jsd.training.java.designpattern.hf.creational.factory.pizzastylebystorefactory.pattern.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
	}
}
