package test.io.jsd.training.java.designpattern.hf.combining.factory.pattern;

import java.util.ArrayList;
import java.util.List;

import io.jsd.training.java.designpattern.hf.combining.factory.bird.Goose;
import io.jsd.training.java.designpattern.hf.combining.factory.bird.Quackable;
import io.jsd.training.java.designpattern.hf.combining.factory.pattern.AbstractDuckFactory;
import io.jsd.training.java.designpattern.hf.combining.factory.pattern.CountingDuckFactory;
import io.jsd.training.java.designpattern.hf.combining.factory.pattern.GooseAdapter;

public class QuackableBuilder {

	private static final AbstractDuckFactory DUCK_FACTORY = new CountingDuckFactory();
	private final List<Quackable> quackableTeam = new ArrayList<Quackable>();

	public QuackableBuilder withMallardDuck() {
		quackableTeam.add(DUCK_FACTORY.createMallardDuck());
		return this;
	}

	public QuackableBuilder withRedHeadDuck() {
		quackableTeam.add(DUCK_FACTORY.createRedheadDuck());
		return this;
	}

	public QuackableBuilder withDuckCall() {
		quackableTeam.add(DUCK_FACTORY.createDuckCall());
		return this;
	}

	public QuackableBuilder withRubberDuck() {
		quackableTeam.add(DUCK_FACTORY.createRubberDuck());
		return this;
	}

	public QuackableBuilder withGoose() {
		quackableTeam.add(new GooseAdapter(new Goose()));
		return this;
	}

	public List<Quackable> build() {
		return quackableTeam;
	}
}
