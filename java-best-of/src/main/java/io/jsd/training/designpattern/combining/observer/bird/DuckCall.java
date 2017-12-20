package io.jsd.training.designpattern.combining.observer.bird;

import io.jsd.training.designpattern.combining.observer.pattern.Observable;
import io.jsd.training.designpattern.combining.observer.pattern.Observer;

public class DuckCall implements Quackable {
	Observable observable;

	public DuckCall() {
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("Kwak");
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
		return "Duck Call";
	}
}
