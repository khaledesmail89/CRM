package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addSillyMember() {
		System.out.println(getClass() + ": Doing my DB Work :  Adding An Account");
	}

	public void goToSleep() {
		System.out.println(getClass() + ": I'm going to sleep");
	}
}
