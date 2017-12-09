package io.jsd.training.java.designpatterns.hf.behavioural.templatemethod.barista.drink;

import io.jsd.training.java.designpatterns.hf.behavioural.templatemethod.barista.behaviour.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
}
