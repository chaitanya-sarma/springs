package org.spring.beanClasses;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class HappyFortuneService implements FortuneService {

	@Value("${foo.team}")
	private String team;

	@Override
	public String todayFortune() {
		return "A very happy day"+team;
	}

}
