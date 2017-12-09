package io.jsd.training.java.designpatterns.hf.behavioural.templatemethod.sort.app;

import java.util.Arrays;

import io.jsd.training.java.designpatterns.hf.behavioural.templatemethod.sort.Duck;

public class DuckSortTestDrive {

	public static void main(String[] args) {
		Duck[] ducks = { //
				new Duck("Daffy", 8), //
				new Duck("Dewey", 2), //
				new Duck("Howard", 7), //
				new Duck("Louie", 2), //
				new Duck("Donald", 10), //
				new Duck("Huey", 2) //
		}; //

		System.out.println("Before sorting:\n");
		display(ducks);

		Arrays.sort(ducks);

		System.out.println("\n\n\nAfter sorting:\n");
		display(ducks);
	}

	public static void display(Duck[] ducks) {
		for (int i = 0; i < ducks.length; i++) {
			System.out.println(ducks[i]);
		}
	}
}
