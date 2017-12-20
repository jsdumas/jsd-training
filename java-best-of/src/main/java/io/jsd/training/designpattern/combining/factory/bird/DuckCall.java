package io.jsd.training.designpattern.combining.factory.bird;

public class DuckCall implements Quackable {

	@Override
	public void quack() {
		System.out.println("Kwak");
	}

	@Override
	public String toString() {
		return "Duck Call";
	}
}
