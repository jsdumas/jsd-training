package io.jsd.training.codingame.thegift;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import io.jsd.training.codingame.thegift.TheGift;

public class TheGiftTest {
	
	private static final String IMPOSSIBLE = "IMPOSSIBLE";
	private static final int GIFT_VALUE = 100;
	private static final int[] CONTRIBUTORS_WITHOUT_BUDGET = {3,42,30};
	private static final int[] CONTRIBUTORS_WITH_BUDGET = {3,42,100};
	
	
	@Test
	public void shouldReturnImpossible() {
		TheGift theGift = new TheGift(CONTRIBUTORS_WITHOUT_BUDGET, GIFT_VALUE);
		MatcherAssert.assertThat(theGift.shareBudget(), Matchers.equalTo(IMPOSSIBLE));
	}

	@Test
	public void shouldReturnThreeFourtyTwoAndFourtyFive() {
		TheGift theGift = new TheGift(CONTRIBUTORS_WITH_BUDGET, GIFT_VALUE);
		MatcherAssert.assertThat(theGift.shareBudget(), Matchers.equalTo("3\n42\n55"));
	}
}
