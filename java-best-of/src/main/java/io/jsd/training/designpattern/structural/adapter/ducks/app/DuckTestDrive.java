package io.jsd.training.designpattern.structural.adapter.ducks.app;

import io.jsd.training.designpattern.structural.adapter.ducks.bird.Duck;
import io.jsd.training.designpattern.structural.adapter.ducks.bird.MallardDuck;
import io.jsd.training.designpattern.structural.adapter.ducks.bird.WildTurkey;
import io.jsd.training.designpattern.structural.adapter.ducks.pattern.TurkeyAdapter;

public class DuckTestDrive {
	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();

		WildTurkey turkey = new WildTurkey();

		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();

		System.out.println("\nThe Duck says...");
		mallardDuck.quack();
		mallardDuck.fly();

		System.out.println("\nThe TurkeyAdapter says...");
		Duck duck = new TurkeyAdapter(turkey);
		duck.quack();
		duck.fly();
	}

}
