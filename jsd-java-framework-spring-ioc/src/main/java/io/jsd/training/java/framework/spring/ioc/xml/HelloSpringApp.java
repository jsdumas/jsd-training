package io.jsd.training.java.framework.spring.ioc.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//let's call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmailAdress());
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getSortedFortune());
		
		//close the context
		context.close();

	}

}
