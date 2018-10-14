package com.luv2code.luv2code;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("inside no-arg constructor Cricket Coach");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	public String getDailyWork() {
		// TODO Auto-generated method stub
		return "practise fast bowling for 15 minutes";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("inside setter setEmailAddress Method");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("inside setter setTeam Method");
		this.team = team;
	}

}
