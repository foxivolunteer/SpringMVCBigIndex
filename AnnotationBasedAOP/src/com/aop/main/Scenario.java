package com.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Scenario {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		MainProgram myMainProgram = (MainProgram) ctx.getBean("mainprogram");
		myMainProgram.mainProcess();
		
		((ClassPathXmlApplicationContext) ctx).close();
		
		

	}

}
