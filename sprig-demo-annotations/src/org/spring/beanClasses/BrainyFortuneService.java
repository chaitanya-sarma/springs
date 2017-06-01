package org.spring.beanClasses;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class BrainyFortuneService implements FortuneService {

	@Override
	public String todayFortune() {
		return "A good day my Bwoy!!";
	}

}
