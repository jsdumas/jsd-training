package io.jsd.training.designpatterns.hf.behavioural.templatemethod.barista.drink;

import io.jsd.training.designpatterns.hf.behavioural.templatemethod.barista.behaviour.CaffeineBeverage;

public class Tea extends CaffeineBeverage {
	public void brew() {
		System.out.println("Steeping the tea");
	}
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}
}
