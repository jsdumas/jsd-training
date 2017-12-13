package io.jsd.training.java.designpattern.hf.behavioural.command.party.app;

import io.jsd.training.java.designpattern.hf.behavioural.command.party.homeappliance.Hottub;
import io.jsd.training.java.designpattern.hf.behavioural.command.party.homeappliance.Light;
import io.jsd.training.java.designpattern.hf.behavioural.command.party.homeappliance.Stereo;
import io.jsd.training.java.designpattern.hf.behavioural.command.party.homeappliance.TV;
import io.jsd.training.java.designpattern.hf.behavioural.command.party.pattern.Command;
import io.jsd.training.java.designpattern.hf.behavioural.command.party.pattern.HottubOffCommand;
import io.jsd.training.java.designpattern.hf.behavioural.command.party.pattern.HottubOnCommand;
import io.jsd.training.java.designpattern.hf.behavioural.command.party.pattern.LightOffCommand;
import io.jsd.training.java.designpattern.hf.behavioural.command.party.pattern.LightOnCommand;
import io.jsd.training.java.designpattern.hf.behavioural.command.party.pattern.MacroCommand;
import io.jsd.training.java.designpattern.hf.behavioural.command.party.pattern.RemoteControl;
import io.jsd.training.java.designpattern.hf.behavioural.command.party.pattern.StereoOffCommand;
import io.jsd.training.java.designpattern.hf.behavioural.command.party.pattern.StereoOnCommand;
import io.jsd.training.java.designpattern.hf.behavioural.command.party.pattern.TVOffCommand;
import io.jsd.training.java.designpattern.hf.behavioural.command.party.pattern.TVOnCommand;

public class RemoteLoader {

	public static void main(String[] args) {

		RemoteControl remoteControl = new RemoteControl();

		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();
 
		LightOnCommand lightOn = new LightOnCommand(light);
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);
		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		TVOffCommand tvOff = new TVOffCommand(tv);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);

		Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn};
		Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff};
  
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
 
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
  
		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- Pushing Macro Off---");
		remoteControl.offButtonWasPushed(0);
	}
}
