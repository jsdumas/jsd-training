package io.jsd.training.designpattern.combining.observer.bird;

import io.jsd.training.designpattern.combining.observer.pattern.QuackObservable;

public interface Quackable extends QuackObservable {
	public void quack();
}
