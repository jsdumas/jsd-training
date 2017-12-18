package io.jsd.training.java.designpattern.behavioural.command.party.pattern;

import io.jsd.training.java.designpattern.behavioural.command.party.homeappliance.Stereo;

public class StereoOnWithCDCommand implements Command {
	Stereo stereo;
 
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}

	public void undo() {
		stereo.off();
	}
}
