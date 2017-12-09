package io.jsd.training.designpatterns.hf.combining.adapter.bird;

public class DecoyDuck implements Quackable {
	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
