package org.spring.beanClasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//No bean id specified so the default bean id: tennisCoach is taken.
@Component
public class TennisCoach implements Coach {

	//Field injection
	@Autowired
	@Qualifier("brainyFortuneService")
	private FortuneService fortuneService;
/*	
	// Spring will scan the classes that implement the FortuneSerice class and injects it here.
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
*/
/*
 	// Name can be anything no need to start with set. It is the annotation that is important.
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
*/		
	@Override
	public String getDailyWorkout() {
		return "Play tennis for half an hr.";
	}

	@Override
	public String getFortune() {
		return fortuneService.todayFortune();
	}

}
