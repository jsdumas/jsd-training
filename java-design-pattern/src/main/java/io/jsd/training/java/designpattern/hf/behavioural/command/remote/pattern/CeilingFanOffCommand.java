package io.jsd.training.java.designpattern.hf.behavioural.command.remote.pattern;

import io.jsd.training.java.designpattern.hf.behavioural.command.remote.homeappliance.CeilingFan;

public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.off();
	}
}
