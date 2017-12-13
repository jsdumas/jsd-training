package io.jsd.training.webapp.petclinic.swagger.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;

@Configuration
@EnableSwagger //Loads the spring beans required by the framework
//@PropertySource("/swagger.properties")
public class MySwaggerConfig {
	private SpringSwaggerConfig springSwaggerConfig;

	/**
	 * Required to autowire SpringSwaggerConfig
	 */
	@Autowired
	public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig) {
		this.springSwaggerConfig = springSwaggerConfig;
	}

	/**
	 * Every SwaggerSpringMvcPlugin bean is picked up by the swagger-mvc framework - allowing for multiple
	 * swagger groups i.e. same code base multiple swagger resource listings.
	 */
	@Bean
	public SwaggerSpringMvcPlugin customImplementation(){
		return new SwaggerSpringMvcPlugin(this.springSwaggerConfig)
		.swaggerGroup("")
		// si on ne le met pas, adresse http://localhost:8080/petclinic/rest/api-docs/default/proprietaire
		// si on met "myString", adresse http://localhost:8080/petclinic/rest/api-docs/myString/proprietaire
		.apiInfo(new ApiInfo("REST API Documentation", "This is the description of the REST methods available for Petclinic. Just click on an item to see the associated methods.", "", "treeptik.petclinic@gmail.com", "Treeptik", ""))
		.includePatterns("((?!\\.do).)*");
	}

}
