package io.jsd.training.designpattern.structural.adapter.ducks.bird;

public class MallardDuck implements Duck {

	private static final String QUACK = "Quack like a Mallard Duck.";
	private static final String FLY = "I'm flying proudly like a Mallard Duck.";

	@Override
	public String quack() {
		System.out.println(QUACK);
		return QUACK;
	}

	@Override
	public String fly() {
		System.out.println(FLY);
		return FLY;
	}
}
