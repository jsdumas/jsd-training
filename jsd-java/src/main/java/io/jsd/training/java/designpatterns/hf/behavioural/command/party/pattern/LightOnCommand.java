package io.jsd.training.java.designpatterns.hf.behavioural.command.party.pattern;

import io.jsd.training.java.designpatterns.hf.behavioural.command.party.homeappliance.Light;

public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}

	public void undo() {
		light.off();
	}
}
