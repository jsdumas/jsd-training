package io.jsd.training.java.designpattern.behavioural.command.party.pattern;

import io.jsd.training.java.designpattern.behavioural.command.party.homeappliance.Light;

public class LivingroomLightOnCommand implements Command {
	Light light;

	public LivingroomLightOnCommand(Light light) {
		this.light = light;
	}
	public void execute() {
		light.on();
	}
	public void undo() {
		light.off();
	}
}
