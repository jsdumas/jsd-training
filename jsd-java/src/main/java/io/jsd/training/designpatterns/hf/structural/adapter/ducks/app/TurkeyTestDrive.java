package io.jsd.training.designpatterns.hf.structural.adapter.ducks.app;

import io.jsd.training.designpatterns.hf.structural.adapter.ducks.bird.MallardDuck;
import io.jsd.training.designpatterns.hf.structural.adapter.ducks.bird.Turkey;
import io.jsd.training.designpatterns.hf.structural.adapter.ducks.pattern.DuckAdapter;

public class TurkeyTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		Turkey duckAdapter = new DuckAdapter(duck);

		for (int i = 0; i < 10; i++) {
			System.out.println("The DuckAdapter says...");
			duckAdapter.gobble();
			duckAdapter.fly();
		}
	}
}
