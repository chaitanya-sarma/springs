package mainCls;

import org.spring.beanClasses.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanUsingJavaAnnotations {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("javaAnnotationsApplicationContext.xml");
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		context.close();
	}

}
