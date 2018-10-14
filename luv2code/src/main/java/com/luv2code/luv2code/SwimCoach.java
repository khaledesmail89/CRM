package com.luv2code.luv2code;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{

	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getDailyWork() {
		// TODO Auto-generated method stub
		return "swim 1000 meters as warm up";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	
}
