package io.jsd.training.xml;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//add new fields for emailAdress and team
	private String emailAdress;
	private String team;
	
	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public String getSortedFortune(){
		int index = (int)(Math.random()*3);
		System.out.println(index);
		return fortuneService.getFortuneArray()[index];
	}

	public void setEmailAdress(String emailAdress) {
		System.out.println("CricketCoach: inside setter method - setEmailAdress");
		this.emailAdress = emailAdress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public String getTeam() {
		return team;
	}
	
}
