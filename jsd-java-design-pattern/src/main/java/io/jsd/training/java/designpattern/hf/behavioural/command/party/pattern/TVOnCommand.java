package io.jsd.training.java.designpattern.hf.behavioural.command.party.pattern;

import io.jsd.training.java.designpattern.hf.behavioural.command.party.homeappliance.TV;

public class TVOnCommand implements Command {
	TV tv;

	public TVOnCommand(TV tv) {
		this.tv= tv;
	}

	public void execute() {
		tv.on();
		tv.setInputChannel();
	}

	public void undo() {
		tv.off();
	}
}
