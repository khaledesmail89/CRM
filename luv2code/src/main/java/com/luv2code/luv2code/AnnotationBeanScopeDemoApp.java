package com.luv2code.luv2code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);

		boolean result = (theCoach == alphaCoach);
		System.out.println("\n pointing to the same object: "+ result);
		System.out.println("memoryLocation For theCoach: "+ theCoach);
		System.out.println("memoryLocation For alpha coach: "+ alphaCoach);
		context.close();
	}

}
