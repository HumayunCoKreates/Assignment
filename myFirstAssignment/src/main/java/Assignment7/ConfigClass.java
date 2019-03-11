package Assignment7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
   
	@Bean
	public FortuneService fortuneService() {
		return new MyFortune();
	}
	
	@Bean
	public Coach rugbyCoach() {
		RugbyCoach myrugbyCoach=new RugbyCoach(fortuneService());
		return myrugbyCoach;
	}
}
