package io.jsd.training.webapp.petclinic.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MainController {

	Logger logger = LoggerFactory.getLogger(MainController.class);

	@RequestMapping("index.do")
	public ModelAndView index(){

		return new ModelAndView("index");
	}

}
