package com.luv2code.luv2code;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.luv2code")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	//define bean for fortune service.
	
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();	
	}
	
	//define bean for our swim coach
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
}
