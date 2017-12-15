package io.jsd.training.codingame.maya;

import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

public class MayaNumberConverterTest extends MayaDictionaryInit {

	private static final Long ONE = 1L;

	@Test
	public void whenMayaNumberIsOneThenItShouldRetrurnOne() {
		MatcherAssert.assertThat(MAYA_NUMBER_CONVERTER.mayaNumberToDecimal(MAYA_NUMBER_ONE), equalTo(ONE));
	}

	@Test
	public void whenMayaNumberIsTwelveAndZeroAndFiveThenItShouldReturnFourThousandEightHundredAndFive() {
		MatcherAssert.assertThat(MAYA_NUMBER_CONVERTER.mayaNumberToDecimal(MAYA_NUMBER_TWELVE_ZERO_FIVE), equalTo(
				FOUR_THOUSAND_EIGHT_HUNDRED_AND_FIVE));
	}

	@Test
	public void whenDecimalNumberIsFourThousandEightHundredAndFiveThenItShouldReturnTwelveAndZeroAndFiveMayaNumber() {
		MatcherAssert.assertThat(MAYA_NUMBER_CONVERTER.decimalToMayaNumber(FOUR_THOUSAND_EIGHT_HUNDRED_AND_FIVE), equalTo(
				MAYA_NUMBER_TWELVE_ZERO_FIVE.getCode()));
	}
	
	
	@Test
	public void debug() {
		MatcherAssert.assertThat(MAYA_NUMBER_CONVERTER.decimalToMayaNumber(ZERO), equalTo(
				MAYA_ZERO.getCode()));
	}


}
