package io.jsd.training.designpatterns.hf.combining.observer.pattern;

import io.jsd.training.designpatterns.hf.combining.observer.bird.Goose;
import io.jsd.training.designpatterns.hf.combining.observer.bird.Quackable;

public class GooseAdapter implements Quackable {
	Goose goose;
	Observable observable;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		goose.honk();
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}

	@Override
	public String toString() {
		return "Goose pretending to be a Duck";
	}
}
