package io.jsd.training.designpatterns.hf.behavioural.iterator.dinermergercafe.app;

import java.util.*;

import io.jsd.training.designpatterns.hf.behavioural.iterator.dinermergercafe.Waitress;
import io.jsd.training.designpatterns.hf.behavioural.iterator.dinermergercafe.menu.CafeMenu;
import io.jsd.training.designpatterns.hf.behavioural.iterator.dinermergercafe.menu.DinerMenu;
import io.jsd.training.designpatterns.hf.behavioural.iterator.dinermergercafe.menu.PancakeHouseMenu;

public class MenuTestDrive {
	public static void main(String args[]) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
 
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
 
		waitress.printMenu();
		waitress.printVegetarianMenu();

		System.out.println("\nCustomer asks, is the Hotdog vegetarian?");
		System.out.print("Waitress says: ");
		if (waitress.isItemVegetarian("Hotdog")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println("\nCustomer asks, are the Waffles vegetarian?");
		System.out.print("Waitress says: ");
		if (waitress.isItemVegetarian("Waffles")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
