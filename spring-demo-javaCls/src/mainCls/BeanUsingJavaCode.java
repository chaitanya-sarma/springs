package mainCls;

import org.spring.beanClasses.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanUsingJavaCode {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		context.close();
	}

}
