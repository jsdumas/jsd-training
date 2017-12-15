package io.jsd.training.java.designpattern.behavioural.command.remote.pattern;

import io.jsd.training.java.designpattern.behavioural.command.remote.homeappliance.Stereo;

public class StereoOffCommand implements Command {
	Stereo stereo;
 
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.off();
	}
}
