package io.jsd.training.designpattern.behavioural.templatemethod.barista.drink;

import io.jsd.training.designpattern.behavioural.templatemethod.barista.behaviour.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
}
