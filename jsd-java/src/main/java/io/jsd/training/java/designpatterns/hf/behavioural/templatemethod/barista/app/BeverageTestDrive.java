package io.jsd.training.java.designpatterns.hf.behavioural.templatemethod.barista.app;

import io.jsd.training.java.designpatterns.hf.behavioural.templatemethod.barista.drink.Coffee;
import io.jsd.training.java.designpatterns.hf.behavioural.templatemethod.barista.drink.CoffeeWithHook;
import io.jsd.training.java.designpatterns.hf.behavioural.templatemethod.barista.drink.Tea;
import io.jsd.training.java.designpatterns.hf.behavioural.templatemethod.barista.drink.TeaWithHook;

public class BeverageTestDrive {
	public static void main(String[] args) {
 
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
 
		System.out.println("\nMaking tea...");
		tea.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();

 
		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
		System.out.println("\nMaking tea...");
		teaHook.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffeeHook.prepareRecipe();
	}
}
