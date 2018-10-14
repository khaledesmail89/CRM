package com.luv2code.luv2code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach coach = context.getBean("tennisCoach",Coach.class);
		System.out.println(coach.getDailyWork());
		System.out.println(coach.getDailyFortune());
		context.close();
	}
}
