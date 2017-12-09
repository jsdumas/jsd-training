package io.jsd.training.designpatterns.hf.combining.adapter.app;

import io.jsd.training.designpatterns.hf.combining.adapter.bird.DuckCall;
import io.jsd.training.designpatterns.hf.combining.adapter.bird.Goose;
import io.jsd.training.designpatterns.hf.combining.adapter.bird.MallardDuck;
import io.jsd.training.designpatterns.hf.combining.adapter.bird.Quackable;
import io.jsd.training.designpatterns.hf.combining.adapter.bird.RedheadDuck;
import io.jsd.training.designpatterns.hf.combining.adapter.bird.RubberDuck;
import io.jsd.training.designpatterns.hf.combining.adapter.pattern.GooseAdapter;

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

		// Adapter pattern
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simulator: With Goose Adapter");

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
