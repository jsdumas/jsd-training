package io.jsd.training.java.designpattern.hf.combining.factory.bird;

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
