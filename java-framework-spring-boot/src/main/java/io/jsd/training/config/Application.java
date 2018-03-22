package io.jsd.training.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // same as @Configuration | @EnableAutoConfiguration | @ComponentScan
@ComponentScan(basePackages = "io.jsd.training")
public class Application {

	// @Override
	// protected SpringApplicationBuilder configure(SpringApplicationBuilder
	// application) {
	// return application.sources(SpringBootWebApplication.class);
	// }

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
