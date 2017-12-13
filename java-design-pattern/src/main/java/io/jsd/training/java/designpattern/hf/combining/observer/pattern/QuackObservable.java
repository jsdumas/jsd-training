package io.jsd.training.java.designpattern.hf.combining.observer.pattern;

public interface QuackObservable {
	public void registerObserver(Observer observer);

	public void notifyObservers();
}
