 package mainCls;
import org.spring.beanClasses.Coach;
import org.spring.beanClasses.FortuneService;
import org.spring.beanClasses.HappyFortuneService;
import org.spring.beanClasses.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("org.spring.beanClasses")
@PropertySource("classpath:sports.properties")
public class SpringConfig {

	@Bean
	public FortuneService happyFortuneService(){
		HappyFortuneService happyFortuneService = new HappyFortuneService();
		return happyFortuneService;
	}
	@Bean
	public Coach swimCoach(){
		SwimCoach swimCoach = new SwimCoach(happyFortuneService());
		return swimCoach;
	}
}
