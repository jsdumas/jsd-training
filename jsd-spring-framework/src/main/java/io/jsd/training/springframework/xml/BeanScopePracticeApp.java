package io.jsd.training.springframework.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopePracticeApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		HockeyCoach theCoach = context.getBean("myHockeyCoach", HockeyCoach.class);
		HockeyCoach alphaCoach = context.getBean("myHockeyCoach", HockeyCoach.class);
		
		// check if they are the same
		boolean result = (theCoach==alphaCoach);
		
		// print out the results
		System.out.println("\nPointing to the same object "+ result);
		System.out.println("\nMemory location for the coach: "+theCoach);
		System.out.println("\nMemory location for the coach: "+alphaCoach);
		
		//close the context
		context.close();
	}

}
