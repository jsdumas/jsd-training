package io.jsd.training.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	private static final String HELLO_WORLD = "Hello World!!!!";

	@RequestMapping("/")
	public String home() {
		return "Hello World!!!!";
	}

}
