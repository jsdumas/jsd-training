package io.jsd.training.java.designpattern.behavioural.command.remote.pattern;

import io.jsd.training.java.designpattern.behavioural.command.remote.homeappliance.Hottub;

public class HottubOffCommand implements Command {
	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.cool();
		hottub.off();
	}
}
