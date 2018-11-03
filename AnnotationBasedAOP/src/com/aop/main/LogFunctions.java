package com.aop.main;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("mainlogfunctions")
@Aspect
public class LogFunctions {
	
	@After("execution(void com.aop.main.MainProgram.mainProcess())")
	public void mainLogFunctions() {
		System.out.println("logging has been initiated");
	}
}
