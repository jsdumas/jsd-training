package io.jsd.training.java.designpatterns.hf.structural.facade.hometheater;

public class PopcornPopper {
	private final String description;

	public PopcornPopper(String description) {
		this.description = description;
	}

	public void on() {
		System.out.println(description + " on");
	}

	public void off() {
		System.out.println(description + " off");
	}

	public void pop() {
		System.out.println(description + " popping popcorn!");
	}

	@Override
	public String toString() {
		return description;
	}
}
