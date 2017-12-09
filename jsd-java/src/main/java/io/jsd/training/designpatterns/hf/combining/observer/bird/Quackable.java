package io.jsd.training.designpatterns.hf.combining.observer.bird;

import io.jsd.training.designpatterns.hf.combining.observer.pattern.QuackObservable;

public interface Quackable extends QuackObservable {
	public void quack();
}
