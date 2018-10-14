package com.luv2code.luv2code;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		Coach coach = context.getBean("tennisCoach",Coach.class);
		System.out.println(coach.getDailyWork());
		System.out.println(coach.getDailyFortune());
		context.close();
	}
}
