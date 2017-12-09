package io.jsd.training.designpatterns.hf.creational.builder.creation;

import io.jsd.training.designpatterns.hf.creational.builder.meal.ChickenBurger;
import io.jsd.training.designpatterns.hf.creational.builder.meal.Coke;
import io.jsd.training.designpatterns.hf.creational.builder.meal.Meal;
import io.jsd.training.designpatterns.hf.creational.builder.meal.Pepsi;
import io.jsd.training.designpatterns.hf.creational.builder.meal.VegBurger;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}

}
