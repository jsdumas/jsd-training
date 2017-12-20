package io.jsd.training.designpattern.behavioural.command.remote.pattern;

import io.jsd.training.designpattern.behavioural.command.remote.homeappliance.Stereo;

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
}
