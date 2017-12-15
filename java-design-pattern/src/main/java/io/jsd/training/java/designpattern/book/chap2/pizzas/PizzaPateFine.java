﻿package io.jsd.training.java.designpattern.book.chap2.pizzas;
public class PizzaPateFine extends Pizza {
	public PizzaPateFine() {
		description = "Pizza à pâte fine";
	}

	@Override
	public double calculePrix() {
		return 3.99;
	}
}