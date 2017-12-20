package io.jsd.training.designpattern.combining.observer.pattern;

public interface QuackObservable {
	public void registerObserver(Observer observer);

	public void notifyObservers();
}
