package io.jsd.training.designpatterns.hf.behavioural.command.party.pattern;

import io.jsd.training.designpatterns.hf.behavioural.command.party.homeappliance.Stereo;

public class StereoOffCommand implements Command {
	Stereo stereo;
 
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.off();
	}

	public void undo() {
		stereo.on();
	}
}
