package io.jsd.training.designpattern.combining.factory.app;

import io.jsd.training.designpattern.combining.factory.bird.Goose;
import io.jsd.training.designpattern.combining.factory.bird.Quackable;
import io.jsd.training.designpattern.combining.factory.pattern.AbstractDuckFactory;
import io.jsd.training.designpattern.combining.factory.pattern.CountingDuckFactory;
import io.jsd.training.designpattern.combining.factory.pattern.GooseAdapter;
import io.jsd.training.designpattern.combining.factory.pattern.QuackCounter;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();

		simulator.simulate(duckFactory);
	}

	void simulate(AbstractDuckFactory duckFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simulator: With Abstract Factory");

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
