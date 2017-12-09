package io.jsd.training.designpatterns.hf.combining.decorator.app;

import io.jsd.training.designpatterns.hf.combining.decorator.bird.DuckCall;
import io.jsd.training.designpatterns.hf.combining.decorator.bird.Goose;
import io.jsd.training.designpatterns.hf.combining.decorator.bird.MallardDuck;
import io.jsd.training.designpatterns.hf.combining.decorator.bird.Quackable;
import io.jsd.training.designpatterns.hf.combining.decorator.bird.RedheadDuck;
import io.jsd.training.designpatterns.hf.combining.decorator.bird.RubberDuck;
import io.jsd.training.designpatterns.hf.combining.decorator.pattern.GooseAdapter;
import io.jsd.training.designpatterns.hf.combining.decorator.pattern.QuackCounter;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}

	void simulate() {
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simulator: With Decorator");

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);

		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
