package io.jsd.training.java.designpattern.hf.combining.observer.app;

import io.jsd.training.java.designpattern.hf.combining.observer.bird.Flock;
import io.jsd.training.java.designpattern.hf.combining.observer.bird.Goose;
import io.jsd.training.java.designpattern.hf.combining.observer.bird.Quackable;
import io.jsd.training.java.designpattern.hf.combining.observer.pattern.AbstractDuckFactory;
import io.jsd.training.java.designpattern.hf.combining.observer.pattern.CountingDuckFactory;
import io.jsd.training.java.designpattern.hf.combining.observer.pattern.GooseAdapter;
import io.jsd.training.java.designpattern.hf.combining.observer.pattern.QuackCounter;
import io.jsd.training.java.designpattern.hf.combining.observer.pattern.Quackologist;

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

		System.out.println("\nDuck Simulator: With Observer");

		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);

		simulate(flockOfDucks);

		System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
