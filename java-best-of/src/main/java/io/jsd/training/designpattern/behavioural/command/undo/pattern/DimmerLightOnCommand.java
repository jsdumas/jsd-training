package io.jsd.training.designpattern.behavioural.command.undo.pattern;

import io.jsd.training.designpattern.behavioural.command.undo.homeappliance.Light;

public class DimmerLightOnCommand implements Command {
	Light light;
	int prevLevel;

	public DimmerLightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		prevLevel = light.getLevel();
		light.dim(75);
	}

	public void undo() {
		light.dim(prevLevel);
	}
}
