package io.jsd.training.designpatterns.hf.behavioural.command.remote.pattern;

import io.jsd.training.designpatterns.hf.behavioural.command.remote.homeappliance.GarageDoor;

public class GarageDoorUpCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
}
