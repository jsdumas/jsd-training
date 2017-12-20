package io.jsd.training.designpattern.combining.ducks.app;

import io.jsd.training.designpattern.combining.ducks.bird.DuckCall;
import io.jsd.training.designpattern.combining.ducks.bird.MallardDuck;
import io.jsd.training.designpattern.combining.ducks.bird.Quackable;
import io.jsd.training.designpattern.combining.ducks.bird.RedheadDuck;
import io.jsd.training.designpattern.combining.ducks.bird.RubberDuck;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}

	void simulate() {
		Quackable mallardDuck = new MallardDuck();
		Quackable redheadDuck = new RedheadDuck();
		Quackable duckCall = new DuckCall();
		Quackable rubberDuck = new RubberDuck();

		System.out.println("\nDuck Simulator");

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
