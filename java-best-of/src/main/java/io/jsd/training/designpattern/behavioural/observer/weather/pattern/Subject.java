package io.jsd.training.designpattern.behavioural.observer.weather.pattern;


public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
