package io.jsd.training.java.designpatterns.hf.combining.observer.bird;

import io.jsd.training.java.designpatterns.hf.combining.observer.pattern.QuackObservable;

public interface Quackable extends QuackObservable {
	public void quack();
}
