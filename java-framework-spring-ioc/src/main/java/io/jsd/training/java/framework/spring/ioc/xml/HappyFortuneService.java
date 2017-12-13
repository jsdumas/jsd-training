package io.jsd.training.java.framework.spring.ioc.xml;

public class HappyFortuneService implements FortuneService {

	public String getFortune() {
		return "Today is your lucky day!";
	}

	public String[] getFortuneArray() {
		String[] fortunes = new String[3];
		fortunes[0]="One";
		fortunes[1]="Two";
		fortunes[2]="Three";
		return fortunes;
	}

}
