package io.jsd.training.codingame.telephonenumbers;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import io.jsd.training.codingame.telephonenumbers.PhoneNumberTST;

public class PhoneNumberTSTTest {

	@Test
	public void shouldReturnTwoNode() {
		PhoneNumberTST phoneNumberTST = new PhoneNumberTSTBuilder().with("12").build();
		MatcherAssert.assertThat(phoneNumberTST.getNodeNumber(), Matchers.equalTo(2));
	}

	@Test
	public void shouldReturntThreeNode() {
		PhoneNumberTST phoneNumberTST = new PhoneNumberTSTBuilder().with("12").with("123").build();
		MatcherAssert.assertThat(phoneNumberTST.getNodeNumber(), Matchers.equalTo(3));
	}

	@Test
	public void shouldReturntFourNode() {
		PhoneNumberTST phoneNumberTST = new PhoneNumberTSTBuilder().with("12").with("123").with("124").build();
		// System.out.println(phoneNumberTST.toString());
		MatcherAssert.assertThat(phoneNumberTST.getNodeNumber(), Matchers.equalTo(4));
	}

	@Test
	public void shouldReturntFiveNode() {
		PhoneNumberTST phoneNumberTST = new PhoneNumberTSTBuilder().with("12").with("123").with("124").with("125").build();
		MatcherAssert.assertThat(phoneNumberTST.getNodeNumber(), Matchers.equalTo(5));
	}

}
