package io.jsd.training.java.designpattern.behavioural.command.remote.pattern;

import io.jsd.training.java.designpattern.behavioural.command.remote.homeappliance.Light;

public class LivingroomLightOffCommand implements Command {
	Light light;

	public LivingroomLightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}
}
