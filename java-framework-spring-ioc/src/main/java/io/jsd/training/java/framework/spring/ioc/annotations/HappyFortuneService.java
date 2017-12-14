package io.jsd.training.java.framework.spring.ioc.annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public String getFortune() {
		return "Today is your lucky day!";
	}

}