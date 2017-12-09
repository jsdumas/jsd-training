package io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystorefactory.pattern;

import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.BlackOlives;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Cheese;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Clams;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Dough;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Eggplant;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.FrozenClams;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.MozzarellaCheese;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Pepperoni;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.PlumTomatoSauce;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Sauce;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.SlicedPepperoni;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Spinach;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.ThickCrustDough;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), new Spinach(), new Eggplant() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}
}
