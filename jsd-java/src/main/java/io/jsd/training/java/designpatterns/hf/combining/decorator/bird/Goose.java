package io.jsd.training.java.designpatterns.hf.combining.decorator.bird;

public class Goose {
	public void honk() {
		System.out.println("Honk");
	}

	@Override
	public String toString() {
		return "Goose";
	}
}
