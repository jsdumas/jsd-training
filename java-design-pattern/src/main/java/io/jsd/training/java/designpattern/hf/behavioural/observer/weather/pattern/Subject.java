package io.jsd.training.java.designpattern.hf.behavioural.observer.weather.pattern;


public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
