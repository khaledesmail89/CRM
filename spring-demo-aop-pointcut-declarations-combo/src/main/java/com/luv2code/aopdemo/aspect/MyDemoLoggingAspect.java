package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	public void forDaoPackage() {
	}

	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
	public void getters() {
	}

	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
	public void setters() {
	}

	@Pointcut("forDaoPackage() && !(getters() || setters())")
	public void forDaoPackageNoGetterSetter() {
	}

	// @Before("execution(public void add*())")
	// @Before("execution(void add*())")
	// @Before("execution(* add*(com.luv2code.aopdemo.Account))")
	// @Before("execution(* add*(com.luv2code.aopdemo.Account, ..))")
	// @Before("execution(* add*(..))")
	// first * => return type , second => className , third => methodName
	// @Before("execution(* com.luv2code.aopdemo.*.*(..))")
	@Before("forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n===> executing @Before Advice on addAcount()");
	}

	@Before("forDaoPackageNoGetterSetter()")
	public void performAnalytics() {
		System.out.println("\n===> performing API Analytics");
	}
}
