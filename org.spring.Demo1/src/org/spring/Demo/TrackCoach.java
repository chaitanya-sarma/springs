package org.spring.Demo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService g) {
		this.fortuneService = g;
	}

	@Override
	public String getDailyWorkout() {
		return "Have an hr of fun";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.todayFortune();
	}

}
