package org.spring.beanClasses;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	@Value("${foo.team}")
	String team;
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService happyFortuneService) {
		fortuneService = happyFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swimming is gooood";
	}

	@Override
	public String getFortune() {
		return fortuneService.todayFortune() +  "Swimmers have a good day."+team;
	}

}
