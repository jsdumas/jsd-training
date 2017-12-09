package io.jsd.training.designpatterns.hf.behavioural.command.party.pattern;

import io.jsd.training.designpatterns.hf.behavioural.command.party.homeappliance.Hottub;

public class HottubOffCommand implements Command {
	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.setTemperature(98);
		hottub.off();
	}
	public void undo() {
		hottub.on();
	}
}
