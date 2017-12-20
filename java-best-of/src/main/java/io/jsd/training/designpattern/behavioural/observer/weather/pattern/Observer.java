package io.jsd.training.designpattern.behavioural.observer.weather.pattern;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
