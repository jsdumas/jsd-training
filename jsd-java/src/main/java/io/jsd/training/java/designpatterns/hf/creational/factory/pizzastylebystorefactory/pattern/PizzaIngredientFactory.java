package io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystorefactory.pattern;

import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Cheese;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Clams;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Dough;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Pepperoni;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Sauce;
import io.jsd.training.java.designpatterns.hf.creational.factory.pizzastylebystorefactory.ingredient.Veggies;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
