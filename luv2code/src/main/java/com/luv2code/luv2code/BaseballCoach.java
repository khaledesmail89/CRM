package com.luv2code.luv2code;

import org.springframework.format.FormatterRegistry;

public class BaseballCoach implements Coach {

	//define private field for the dependency
	private FortuneService fortuneService;
	
	//define constructor for dependency injection 
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public String getDailyWork() {
		return "Spend 30 minutes on batting practices";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
