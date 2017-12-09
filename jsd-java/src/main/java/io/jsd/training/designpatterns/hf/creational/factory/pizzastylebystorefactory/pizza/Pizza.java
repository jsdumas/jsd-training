package io.jsd.training.designpatterns.hf.creational.factory.pizzastylebystorefactory.pizza;

import io.jsd.training.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Cheese;
import io.jsd.training.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Clams;
import io.jsd.training.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Dough;
import io.jsd.training.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Pepperoni;
import io.jsd.training.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Sauce;
import io.jsd.training.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Veggies;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;

	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (dough != null) {
			result.append(dough);
			result.append("\n");
		}
		if (sauce != null) {
			result.append(sauce);
			result.append("\n");
		}
		if (cheese != null) {
			result.append(cheese);
			result.append("\n");
		}
		if (veggies != null) {
			for (int i = 0; i < veggies.length; i++) {
				result.append(veggies[i]);
				if (i < veggies.length - 1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (clam != null) {
			result.append(clam);
			result.append("\n");
		}
		if (pepperoni != null) {
			result.append(pepperoni);
			result.append("\n");
		}
		return result.toString();
	}
}
