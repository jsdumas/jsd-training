package io.jsd.training.designpatterns.hf.structural.adapter.ducks.pattern;

import io.jsd.training.designpatterns.hf.structural.adapter.ducks.bird.Duck;
import io.jsd.training.designpatterns.hf.structural.adapter.ducks.bird.Turkey;

public class TurkeyAdapter implements Duck {
	Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public String quack() {
		turkey.gobble();
		return "";
	}

	@Override
	public String fly() {
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
		return "";
	}
}
