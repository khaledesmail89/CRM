package com.luv2code.luv2code;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class HellopSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("myCoach",Coach.class);
		System.out.println(coach.getDailyWork());
		System.out.println(coach.getDailyFortune());
	
	}

}
 
