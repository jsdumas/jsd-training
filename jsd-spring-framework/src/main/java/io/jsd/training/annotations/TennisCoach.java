package io.jsd.training.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// define my init method
	@PostConstruct
	public void doMyStartupStuff(){
		System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff(){
		System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
	}
	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService){
//		this.fortuneService=fortuneService;
//	}
	
	// define a default constructor
	public TennisCoach(){
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	// define a setter method
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService){
//		System.out.println(">> TennisCoach: inside setFortuneService() method");
//		this.fortuneService=fortuneService;
//	}
	
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService){
//		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
//		this.fortuneService=fortuneService;
//	}

	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
