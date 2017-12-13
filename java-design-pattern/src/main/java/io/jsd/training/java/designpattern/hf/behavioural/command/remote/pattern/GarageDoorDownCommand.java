package io.jsd.training.java.designpattern.hf.behavioural.command.remote.pattern;

import io.jsd.training.java.designpattern.hf.behavioural.command.remote.homeappliance.GarageDoor;

public class GarageDoorDownCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
}
