package io.jsd.training.designpattern.combining.adapter.bird;

public class DuckCall implements Quackable {
	@Override
	public void quack() {
		System.out.println("Kwak");
	}
}
