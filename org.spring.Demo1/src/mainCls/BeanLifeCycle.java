package mainCls;

import org.spring.Demo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {

	public static void main(String[] args) {
		System.out.println("A");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		System.out.println("C");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		System.out.println("D");
		context.close();
		System.out.println("E");
		theCoach.getDailyFortune();
		System.out.println("F");
	}
}
