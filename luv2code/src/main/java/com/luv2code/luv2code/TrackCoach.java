package com.luv2code.luv2code;

public class TrackCoach implements Coach {

	//define private field for the dependency
		private FortuneService fortuneService;
		
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWork() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do it: "+ this.fortuneService.getFortune();
	}

}
