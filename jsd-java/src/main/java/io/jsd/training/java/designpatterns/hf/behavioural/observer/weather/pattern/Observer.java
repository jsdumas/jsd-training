package io.jsd.training.java.designpatterns.hf.behavioural.observer.weather.pattern;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
