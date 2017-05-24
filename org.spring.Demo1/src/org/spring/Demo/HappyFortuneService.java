package org.spring.Demo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String todayFortune() {
		return "A very happy day";
	}

}
