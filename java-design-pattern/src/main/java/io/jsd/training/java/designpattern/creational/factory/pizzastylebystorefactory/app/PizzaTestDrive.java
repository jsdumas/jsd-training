package io.jsd.training.java.designpattern.creational.factory.pizzastylebystorefactory.app;

import io.jsd.training.java.designpattern.creational.factory.pizzastylebystorefactory.pizza.Pizza;
import io.jsd.training.java.designpattern.creational.factory.pizzastylebystorefactory.store.ChicagoPizzaStore;
import io.jsd.training.java.designpattern.creational.factory.pizzastylebystorefactory.store.NYPizzaStore;
import io.jsd.training.java.designpattern.creational.factory.pizzastylebystorefactory.store.PizzaStore;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("clam");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza + "\n");
	}
}
