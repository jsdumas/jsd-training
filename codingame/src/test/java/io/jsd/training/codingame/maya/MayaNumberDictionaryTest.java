package io.jsd.training.codingame.maya;

import static io.jsd.training.codingame.maya.Dialect.NINE;
import static io.jsd.training.codingame.maya.Dialect.TWELVE;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class MayaNumberDictionaryTest extends MayaDictionaryInit {

	@Test
	public void keyZeroOfDictionnaryShouldReturnCodeZero() {
		assertThat(MAYA_DICTIONNARY.getMayaNumber(0), equalTo(Dialect.ZERO.getCode()));
	}

	@Test
	public void keyNineOfDictionnaryShouldReturnCodeNine() {
		assertThat(MAYA_DICTIONNARY.getMayaNumber(9), equalTo(NINE.getCode()));
	}

	@Test
	public void keyTwelveOfDictionnaryShouldReturnCodeTwelve() {
		assertThat(MAYA_DICTIONNARY.getMayaNumber(12), equalTo(TWELVE.getCode()));
	}

}
