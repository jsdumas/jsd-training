package test.io.jsd.training.codingame.teads;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import io.jsd.training.codingame.teads.TeadsBroadcasting;

public class TeadsBroadcastingTest {

	private static final TeadsBroadcasting TEADS_BROADCASTING = new TeadsBroadcastingBuilder().with(1, 2).with(2, 3).build();

	@Test
	public void shortestBroadcastingHourShouldBeOneHour() {
		MatcherAssert.assertThat(TEADS_BROADCASTING.getShortestHourNumber(), Matchers.equalTo(1));
	}

}
