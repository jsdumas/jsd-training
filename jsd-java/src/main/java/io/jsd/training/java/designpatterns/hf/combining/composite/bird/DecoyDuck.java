package io.jsd.training.java.designpatterns.hf.combining.composite.bird;

public class DecoyDuck implements Quackable {

	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}

	@Override
	public String toString() {
		return "Decoy Duck";
	}
}
