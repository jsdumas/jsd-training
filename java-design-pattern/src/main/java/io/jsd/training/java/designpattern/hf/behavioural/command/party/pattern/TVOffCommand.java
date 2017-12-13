package io.jsd.training.java.designpattern.hf.behavioural.command.party.pattern;

import io.jsd.training.java.designpattern.hf.behavioural.command.party.homeappliance.TV;

public class TVOffCommand implements Command {
	TV tv;

	public TVOffCommand(TV tv) {
		this.tv= tv;
	}

	public void execute() {
		tv.off();
	}

	public void undo() {
		tv.on();
	}
}
