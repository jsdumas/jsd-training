package test.io.jsd.training.java.designpattern.hf.combining.factory.pattern;

import java.util.List;

import io.jsd.training.java.designpattern.combining.factory.bird.Quackable;
import io.jsd.training.java.designpattern.combining.factory.pattern.QuackCounter;

public class QuackSimulator {

	private final List<Quackable> quackableTeam;

	public QuackSimulator(List<Quackable> quackableTeam) {
		this.quackableTeam = quackableTeam;
	}

	public int getNumberOfQuackWhenEachDuckQuackOneTime() {
		eachDuckQuackOneTime();
		return QuackCounter.getQuacks();
	}

	private void eachDuckQuackOneTime() {
		for (Quackable quackable : quackableTeam) {
			simulate(quackable);
		}
	}

	private void simulate(Quackable duck) {
		duck.quack();
	}

}
