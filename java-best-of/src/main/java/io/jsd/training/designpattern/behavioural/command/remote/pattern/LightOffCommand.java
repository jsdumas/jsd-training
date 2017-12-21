package io.jsd.training.designpattern.behavioural.command.remote.pattern;

import io.jsd.training.designpattern.behavioural.command.remote.homeappliance.Light;

public class LightOffCommand implements Command {
	Light light;
 
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}
}
