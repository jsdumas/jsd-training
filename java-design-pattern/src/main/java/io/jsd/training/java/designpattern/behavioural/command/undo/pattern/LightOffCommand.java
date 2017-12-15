package io.jsd.training.java.designpattern.behavioural.command.undo.pattern;

import io.jsd.training.java.designpattern.behavioural.command.undo.homeappliance.Light;

public class LightOffCommand implements Command {
	Light light;
	int level;
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
        level = light.getLevel();
		light.off();
	}
 
	public void undo() {
		light.dim(level);
	}
}
