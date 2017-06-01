package mainCls;

import org.spring.Demo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScope {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theAlphaCoach = context.getBean("myCoach", Coach.class);
		if(theCoach == theAlphaCoach)
			System.out.println("addfsdfds");
		else
			System.out.println("pqpqpq");
		context.close();
	}

}
