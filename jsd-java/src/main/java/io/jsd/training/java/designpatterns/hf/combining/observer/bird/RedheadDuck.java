package io.jsd.training.java.designpatterns.hf.combining.observer.bird;

import io.jsd.training.java.designpatterns.hf.combining.observer.pattern.Observable;
import io.jsd.training.java.designpatterns.hf.combining.observer.pattern.Observer;

public class RedheadDuck implements Quackable {
	Observable observable;

	public RedheadDuck() {
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("Quack");
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
		return "Redhead Duck";
	}
}
