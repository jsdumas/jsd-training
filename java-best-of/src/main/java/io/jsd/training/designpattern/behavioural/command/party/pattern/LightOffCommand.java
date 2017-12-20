package io.jsd.training.designpattern.behavioural.command.party.pattern;

import io.jsd.training.designpattern.behavioural.command.party.homeappliance.Light;

public class LightOffCommand implements Command {
	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}

	public void undo() {
		light.on();
	}
}
