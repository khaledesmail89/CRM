package com.luv2code.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

	@AfterThrowing(pointcut = "execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))", throwing = "theExc")
	public void afterThrowingFindAccountsAdvice(JoinPoint joinPoint, Throwable theExc) {
		String methodSig = joinPoint.getSignature().toShortString();
		System.out.println("\n====> Executing afterThrowing on method : " + methodSig);
		System.out.println("\n====> The Exception is : " + theExc);
	}

	@AfterReturning(pointcut = "execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))", returning = "result")
	public void afterReturningFindAccountsAdvice(JoinPoint joinPoint, List<Account> result) {
		String methodSig = joinPoint.getSignature().toShortString();
		System.out.println("\n====> Executing after returning on method : " + methodSig);
		System.out.println("result is : " + result);
		convertToUpperCase(result);
		System.out.println("result is : " + result);
	}

	private void convertToUpperCase(List<Account> result) {
		for (Account account : result) {
			String accountName = account.getName().toUpperCase();
			account.setName(accountName);
		}
	}

	@Before("com.luv2code.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice(JoinPoint joinPoint) {
		System.out.println("\n===> executing @Before Advice on addAcount()");
		// display method signature
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		System.out.println("Method signature: " + methodSignature);

		// display method arguments
		Object[] args = joinPoint.getArgs();

		for (Object arg : args) {
			if (arg instanceof Account) {
				Account account = (Account) arg;
				System.out.println("account name : " + account.getName());
				System.out.println("account level: " + account.getLevel());
			}
		}
	}

}
