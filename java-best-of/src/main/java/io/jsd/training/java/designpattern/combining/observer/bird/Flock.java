package io.jsd.training.java.designpattern.combining.observer.bird;

import java.util.ArrayList;
import java.util.Iterator;

import io.jsd.training.java.designpattern.combining.observer.pattern.Observer;

public class Flock implements Quackable {
	ArrayList ducks = new ArrayList();

	public void add(Quackable duck) {
		ducks.add(duck);
	}

	@Override
	public void quack() {
		Iterator iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable) iterator.next();
			duck.quack();
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		Iterator iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable) iterator.next();
			duck.registerObserver(observer);
		}
	}

	@Override
	public void notifyObservers() {
	}

	@Override
	public String toString() {
		return "Flock of Ducks";
	}
}
