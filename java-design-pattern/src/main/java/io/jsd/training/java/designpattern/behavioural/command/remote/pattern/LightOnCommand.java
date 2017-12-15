package io.jsd.training.java.designpattern.behavioural.command.remote.pattern;

import io.jsd.training.java.designpattern.behavioural.command.remote.homeappliance.Light;

public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}
