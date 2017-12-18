package io.jsd.training.java.designpattern.structural.composite.menu;

import io.jsd.training.java.designpattern.structural.composite.menu.pattern.MenuComponent;

public class Waitress {
	MenuComponent allMenus;

	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}

	public void printMenu() {
		allMenus.print();
	}
}
