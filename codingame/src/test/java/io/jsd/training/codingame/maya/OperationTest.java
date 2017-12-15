package io.jsd.training.codingame.maya;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import io.jsd.training.codingame.maya.MayaOperation;

public class OperationTest extends MayaDictionaryInit {

	private static final MayaOperation OPERATION = new MayaOperation(MAYA_DICTIONNARY, MAYA_NUMBER_TWELVE_ZERO_FIVE,
			MAYA_NUMBER_ONE);
	private static final Long FOUR_THOUSAND_EIGHT_HUNDRED_AND_SIX = 4806L;
	private static final Long FOUR_THOUSAND_EIGHT_HUNDRED_AND_FOUR = 4804L;
	
	private static final MayaOperation OPERATION_MULTIPLICATION = new MayaOperation(MAYA_DICTIONNARY, MAYA_NUMBER_FIFTEEN_HEIGHT_TWEVE_SIXTEEN,
			MAYA_NUMBER_FIFTEEN_HEIGHT_TWEVE_SIXTEEN_ZERO);

	@Test
	public void whenFourThousandEightHundredAndFivePlusOneThenEqualFourThousandEightHundredAndSix() {
		MatcherAssert.assertThat(OPERATION.calcul("+"), Matchers.equalTo(FOUR_THOUSAND_EIGHT_HUNDRED_AND_SIX));
	}

	@Test
	public void whenFourThousandEightHundredAndFiveMinusOneThenEqualFourThousandEightHundredAndFour() {
		MatcherAssert.assertThat(OPERATION.calcul("-"), Matchers.equalTo(FOUR_THOUSAND_EIGHT_HUNDRED_AND_FOUR));
	}

	@Test
	public void whenFourThousandEightHundredAndFiveDivisedByOneThenEqualFourThousandEightHundredAndFive() {
		MatcherAssert.assertThat(OPERATION.calcul("/"), Matchers.equalTo(FOUR_THOUSAND_EIGHT_HUNDRED_AND_FIVE));
	}

	@Test
	public void whenFourThousandEightHundredAndFiveMultiplyByOneThenEqualFourThousandEightHundredAndSix() {
		MatcherAssert.assertThat(OPERATION.calcul("*"), Matchers.equalTo(FOUR_THOUSAND_EIGHT_HUNDRED_AND_FIVE));
	}
	
	@Test
	public void debug() {
		MatcherAssert.assertThat(OPERATION_MULTIPLICATION.calcul("*"), Matchers.equalTo(DEBUG));
	}

}
