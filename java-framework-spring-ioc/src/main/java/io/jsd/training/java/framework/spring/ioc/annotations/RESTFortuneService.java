package io.jsd.training.java.framework.spring.ioc.annotations;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	public String getFortune() {
		return "rest";
	}

}
