package com.luv2code.luv2code;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is your lucky day!";
	}

}
