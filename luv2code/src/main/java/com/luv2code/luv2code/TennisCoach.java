package com.luv2code.luv2code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
	@PostConstruct
	public void doMyStartupStuff() {
	System.out.println("inside of doMyStartupStuff method");		
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("inside of doMyCleanupStuff method");		

	}
	
//	@Autowired
//	public TennisCoach (FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired
//	public void dosomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println("inside dosomeCrazyStuff method");
//		this.fortuneService = fortuneService;
//	}

	public String getDailyWork() {
		// TODO Auto-generated method stub
		return "practise your backhand volley";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getFortune();
	}

}
