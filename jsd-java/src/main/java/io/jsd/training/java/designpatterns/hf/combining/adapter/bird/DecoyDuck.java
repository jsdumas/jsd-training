package io.jsd.training.java.designpatterns.hf.combining.adapter.bird;

public class DecoyDuck implements Quackable {
	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
