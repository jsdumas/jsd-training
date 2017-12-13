package io.jsd.training.java.designpattern.hf.behavioural.observer.weather.pattern;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
