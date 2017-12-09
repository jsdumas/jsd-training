package io.jsd.training.designpatterns.hf.combining.composite.app;

import io.jsd.training.designpatterns.hf.combining.composite.bird.Flock;
import io.jsd.training.designpatterns.hf.combining.composite.bird.Goose;
import io.jsd.training.designpatterns.hf.combining.composite.bird.Quackable;
import io.jsd.training.designpatterns.hf.combining.composite.pattern.AbstractDuckFactory;
import io.jsd.training.designpatterns.hf.combining.composite.pattern.CountingDuckFactory;
import io.jsd.training.designpatterns.hf.combining.composite.pattern.GooseAdapter;
import io.jsd.training.designpatterns.hf.combining.composite.pattern.QuackCounter;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();

		simulator.simulate(duckFactory);
	}

	void simulate(AbstractDuckFactory duckFactory) {
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simulator: With Composite - Flocks");

		Flock flockOfDucks = new Flock();

		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);

		Flock flockOfMallards = new Flock();

		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();

		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);

		flockOfDucks.add(flockOfMallards);

		System.out.println("\nDuck Simulator: Whole Flock Simulation");
		simulate(flockOfDucks);

		System.out.println("\nDuck Simulator: Mallard Flock Simulation");
		simulate(flockOfMallards);

		System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
