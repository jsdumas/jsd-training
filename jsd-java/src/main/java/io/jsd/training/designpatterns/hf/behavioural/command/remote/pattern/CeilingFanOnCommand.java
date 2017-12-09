package io.jsd.training.designpatterns.hf.behavioural.command.remote.pattern;

import io.jsd.training.designpatterns.hf.behavioural.command.remote.homeappliance.CeilingFan;

public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.high();
	}
}
