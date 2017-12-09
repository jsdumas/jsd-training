package io.jsd.training.xml;

public class HockeyCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public HockeyCoach(FortuneService fortuneService){
		this.fortuneService=fortuneService;
	}

	public String getDailyWorkout() {
		return "slap the puck";
	}

	public String getDailyFortune() {
		return "Stanley cub is ours!";
	}

}
