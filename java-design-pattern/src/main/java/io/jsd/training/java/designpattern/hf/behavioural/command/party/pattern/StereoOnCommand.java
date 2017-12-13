package io.jsd.training.java.designpattern.hf.behavioural.command.party.pattern;

import io.jsd.training.java.designpattern.hf.behavioural.command.party.homeappliance.Stereo;

public class StereoOnCommand implements Command {
	Stereo stereo;

	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {
		stereo.on();
	}

	public void undo() {
		stereo.off();
	}
}
