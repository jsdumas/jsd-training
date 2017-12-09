package io.jsd.training.designpatterns.hf.behavioural.command.undo.pattern;

import io.jsd.training.designpatterns.hf.behavioural.command.undo.homeappliance.Light;

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
