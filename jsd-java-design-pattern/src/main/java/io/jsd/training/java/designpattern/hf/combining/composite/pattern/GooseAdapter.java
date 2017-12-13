package io.jsd.training.java.designpattern.hf.combining.composite.pattern;

import io.jsd.training.java.designpattern.hf.combining.composite.bird.Goose;
import io.jsd.training.java.designpattern.hf.combining.composite.bird.Quackable;

public class GooseAdapter implements Quackable {
	Goose goose;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}

	@Override
	public void quack() {
		goose.honk();
	}

	@Override
	public String toString() {
		return "Goose pretending to be a Duck";
	}
}
