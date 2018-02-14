package io.jsd.training.designpattern.behavioural.decorator.starbuzz.app;

import io.jsd.training.designpattern.behavioural.decorator.starbuzz.beverage.Beverage;
import io.jsd.training.designpattern.behavioural.decorator.starbuzz.beverage.DarkRoast;
import io.jsd.training.designpattern.behavioural.decorator.starbuzz.beverage.Espresso;
import io.jsd.training.designpattern.behavioural.decorator.starbuzz.beverage.HouseBlend;
import io.jsd.training.designpattern.behavioural.decorator.starbuzz.pattern.Mocha;
import io.jsd.training.designpattern.behavioural.decorator.starbuzz.pattern.Soy;
import io.jsd.training.designpattern.behavioural.decorator.starbuzz.pattern.Whip;

public class StarbuzzCoffee {

	public static void main(String args[]) {

		// Espresso declaration
		// Espresso is a beverage
		Beverage espresso = new Espresso();
		System.out.println(espresso.getDescription() + " $" + espresso.cost());

		// DarkRoast declaration
		// DarkRoast is a beverage
		Beverage darkRoast = new DarkRoast();
		// DarkRoast injection in Mocha
		darkRoast = new Mocha(darkRoast);
		// DarkRoast injection in Mocha
		darkRoast = new Mocha(darkRoast);
		// DarkRoast injection in Whip
		darkRoast = new Whip(darkRoast);
		System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

		// HouseBlend declaration
		// HouseBlend is a beverage
		Beverage houseBlend = new HouseBlend();
		// HouseBlend injection in Soy
		houseBlend = new Soy(houseBlend);
		System.out.println(houseBlend instanceof Soy);
		// HouseBlend injection in Mocha
		houseBlend = new Mocha(houseBlend);
		// HouseBlend injection in Whip
		houseBlend = new Whip(houseBlend);
		System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
		System.out.println(houseBlend instanceof HouseBlend);
		System.out.println(houseBlend instanceof Soy);
		System.out.println(houseBlend instanceof Whip);

	}
}
