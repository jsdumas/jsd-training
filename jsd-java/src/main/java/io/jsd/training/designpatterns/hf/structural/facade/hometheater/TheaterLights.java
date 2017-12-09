package io.jsd.training.designpatterns.hf.structural.facade.hometheater;

public class TheaterLights {
	private final String description;

	public TheaterLights(String description) {
		this.description = description;
	}

	public void on() {
		System.out.println(description + " on");
	}

	public void off() {
		System.out.println(description + " off");
	}

	public void dim(int level) {
		System.out.println(description + " dimming to " + level + "%");
	}

	@Override
	public String toString() {
		return description;
	}
}
