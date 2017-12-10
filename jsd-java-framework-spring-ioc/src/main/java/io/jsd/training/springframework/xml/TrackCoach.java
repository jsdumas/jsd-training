package io.jsd.training.springframework.xml;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "run a hard 5k";
	}

	public String getDailyFortune() {
		return "Just Do It: "+fortuneService.getFortune();
	}
	
	
	// add an init method
	public void doMyStartupStuff(){
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	// add a destroy method
	public void doMyCleanupStuffYoYo(){
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
	}

}
