package io.jsd.training.java.designpatterns.hf.structural.facade.hometheater;

public class Screen {
	private final String description;

	public Screen(String description) {
		this.description = description;
	}

	public void up() {
		System.out.println(description + " going up");
	}

	public void down() {
		System.out.println(description + " going down");
	}

	@Override
	public String toString() {
		return description;
	}
}
