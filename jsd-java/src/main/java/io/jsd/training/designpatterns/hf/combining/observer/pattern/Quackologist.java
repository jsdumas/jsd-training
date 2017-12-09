package io.jsd.training.designpatterns.hf.combining.observer.pattern;


public class Quackologist implements Observer {

	@Override
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked.");
	}

	@Override
	public String toString() {
		return "Quackologist";
	}
}
