package test.io.jsd.training.java.designpattern.hf.behavioural.command.party.homeappliance;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import io.jsd.training.java.designpattern.behavioural.command.party.homeappliance.Light;
import io.jsd.training.java.designpattern.behavioural.command.party.pattern.LightOffCommand;
import io.jsd.training.java.designpattern.behavioural.command.party.pattern.LightOnCommand;

public class LightTest {

	private static final Light LIGHT = new Light("Living Room");
	private static final LightOnCommand COMMANDE_ON = new LightOnCommand(LIGHT);
	private static final LightOffCommand COMMANDE_OFF = new LightOffCommand(LIGHT);
	private static final int LIGHT_ON = 100;
	private static final int LIGHT_OFF = 0;

	@Test
	public void lightShouldBeturnedOn() {
		COMMANDE_ON.execute();
		MatcherAssert.assertThat(LIGHT.getLevel(), Matchers.equalTo(LIGHT_ON));
	}

	@Test
	public void lightShouldBeturnedOff() {
		COMMANDE_OFF.execute();
		MatcherAssert.assertThat(LIGHT.getLevel(), Matchers.equalTo(LIGHT_OFF));
	}

}
