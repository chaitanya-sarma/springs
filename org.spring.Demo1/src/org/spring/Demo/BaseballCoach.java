package org.spring.Demo;


public class BaseballCoach implements Coach{
	// Private field for dependency
	private FortuneService fortuneService;
	
	// Constructor for dependency injection.
	public BaseballCoach(FortuneService f1) {
		this.fortuneService = f1;
	}
	@Override
	public String getDailyWorkout() {
		return "30 min of fun stuff";
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.todayFortune();
	}
	
	
}
