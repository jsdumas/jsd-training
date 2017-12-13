package io.jsd.training.java.designpattern.hf.creational.builder.app;

import io.jsd.training.java.designpattern.hf.creational.builder.creation.MealBuilder;
import io.jsd.training.java.designpattern.hf.creational.builder.meal.Meal;

public class BuilderPatternDemo {

	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
	}

}
