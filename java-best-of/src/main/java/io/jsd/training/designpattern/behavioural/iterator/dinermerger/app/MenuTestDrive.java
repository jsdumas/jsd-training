package io.jsd.training.designpattern.behavioural.iterator.dinermerger.app;

import java.util.*;

import io.jsd.training.designpattern.behavioural.iterator.dinermerger.Waitress;
import io.jsd.training.designpattern.behavioural.iterator.dinermerger.menu.DinerMenu;
import io.jsd.training.designpattern.behavioural.iterator.dinermerger.menu.MenuItem;
import io.jsd.training.designpattern.behavioural.iterator.dinermerger.menu.PancakeHouseMenu;

public class MenuTestDrive {
	public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
 
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
 
		waitress.printMenu();
	}

	public static void printMenu() {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();

		ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
 
		for (int i = 0; i < breakfastItems.size(); i++) {
			MenuItem menuItem = (MenuItem)breakfastItems.get(i);
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}

		MenuItem[] lunchItems = dinerMenu.getMenuItems();
 
		for (int i = 0; i < lunchItems.length; i++) {
			MenuItem menuItem = lunchItems[i];
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}
	}
}
