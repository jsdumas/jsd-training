package io.jsd.training.codingame.telephonenumbers;

import io.jsd.training.codingame.telephonenumbers.PhoneNumberTST;

public class PhoneNumberTSTBuilder {
	
	private final PhoneNumberTST PHONE_NUMBER_TST = new PhoneNumberTST();

	public PhoneNumberTSTBuilder with(String phoneNumber) {
		PHONE_NUMBER_TST.put(phoneNumber);
		return this;
	}

	public PhoneNumberTST build() {
		return PHONE_NUMBER_TST;
	}

}
