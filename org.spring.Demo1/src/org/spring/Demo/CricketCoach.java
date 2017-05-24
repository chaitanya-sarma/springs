package org.spring.Demo;

public class CricketCoach implements Coach{

	private String team;
	public void setTeam(String team) {
		this.team = team;
	}

	public String getTeam() {
		return team;
	}

	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "This is a cricket coach";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.todayFortune() + getTeam();
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

}
