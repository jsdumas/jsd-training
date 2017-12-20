package io.jsd.training.designpattern.combining.decorator.bird;

public class Goose {
	public void honk() {
		System.out.println("Honk");
	}

	@Override
	public String toString() {
		return "Goose";
	}
}
