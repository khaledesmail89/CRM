package com.luv2code.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {

	private String name;
	private String serviceCode;

	public List<Account> findAccounts(boolean tripWire) {

		if (tripWire) {
			throw new RuntimeException("No Soup For You!!");
		}
		List<Account> accounts = new ArrayList<>();
		accounts.add(new Account("john", "silver"));
		accounts.add(new Account("mary", "gold"));
		accounts.add(new Account("khaled", "platinum"));
		return accounts;
	}

	public void addAccount(Account account, boolean flag) {
		System.out.println(getClass() + ": Doing my DB Work :  Adding An Account");
	}

	public boolean doWork() {
		System.out.println(getClass() + " do Work");
		return false;
	}

	public String getName() {
		System.out.println(getClass() + " in getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + " int setName()");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + " getServiceCode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + " setServiceCode()");
		this.serviceCode = serviceCode;
	}

}
