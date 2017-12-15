package io.jsd.training.java.designpattern.creational.factory.pizzastylebystorefactory.pattern;

import io.jsd.training.java.designpattern.creational.factory.pizzastylebystorefactory.ingredient.Cheese;
import io.jsd.training.java.designpattern.creational.factory.pizzastylebystorefactory.ingredient.Clams;
import io.jsd.training.java.designpattern.creational.factory.pizzastylebystorefactory.ingredient.Dough;
import io.jsd.training.java.designpattern.creational.factory.pizzastylebystorefactory.ingredient.FreshClams;
import io.jsd.training.java.designpattern.creational.factory.pizzastylebystorefactory.ingredient.Garlic;
import io.jsd.training.java.designpattern.creational.factory.pizzastylebystorefactory.ingredient.MarinaraSauce;
import io.jsd.training.java.designpattern.creational.factory.pizzastylebystorefactory.ingredient.Mushroom;
import io.jsd.training.java.designpattern.creational.factory.pizzastylebystorefactory.ingredient.Onion;
import io.jsd.training.java.designpattern.creational.factory.pizzastylebystorefactory.ingredient.Pepperoni;
import io.jsd.training.java.designpattern.creational.factory.pizzastylebystorefactory.ingredient.RedPepper;
import io.jsd.training.java.designpattern.creational.factory.pizzastylebystorefactory.ingredient.ReggianoCheese;
import io.jsd.training.java.designpattern.creational.factory.pizzastylebystorefactory.ingredient.Sauce;
import io.jsd.training.java.designpattern.creational.factory.pizzastylebystorefactory.ingredient.SlicedPepperoni;
import io.jsd.training.java.designpattern.creational.factory.pizzastylebystorefactory.ingredient.ThinCrustDough;
import io.jsd.training.java.designpattern.creational.factory.pizzastylebystorefactory.ingredient.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}
}
