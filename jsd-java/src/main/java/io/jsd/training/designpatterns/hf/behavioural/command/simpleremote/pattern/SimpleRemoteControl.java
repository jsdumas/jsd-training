package io.jsd.training.designpatterns.hf.behavioural.command.simpleremote.pattern;

import java.util.*;

//
// This is the invoker
//
public class SimpleRemoteControl {
	Command slot;
 
	public SimpleRemoteControl() {}
 
	public void setCommand(Command command) {
		slot = command;
	}
 
	public void buttonWasPressed() {
		slot.execute();
	}
}
