package io.jsd.training.java.designpattern.hf.combining.observer.pattern;


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
