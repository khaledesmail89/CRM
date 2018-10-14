package com.luv2code.luv2code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

CricketCoach coach = context.getBean("myCricketCoach",CricketCoach.class);
System.out.println(coach.getDailyWork());
System.out.println(coach.getDailyFortune());
System.out.println(coach.getEmailAddress());
System.out.println(coach.getTeam());
		context.close();
	}

}
