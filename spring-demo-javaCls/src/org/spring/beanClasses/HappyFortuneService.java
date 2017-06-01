package org.spring.beanClasses;

import org.springframework.stereotype.Component;

@Component 
public class HappyFortuneService implements FortuneService {

	@Override
	public String todayFortune() {
		return "A very happy day";
	}

}
