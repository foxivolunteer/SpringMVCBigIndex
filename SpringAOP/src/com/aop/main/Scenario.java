package com.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Scenario {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("myservlet-servlet.xml");
		MainProgram myMain = (MainProgram) ctx.getBean("MainProgram");
		myMain.MymainProgramBlock();
		
		((ClassPathXmlApplicationContext) ctx).close();
		
		

	}

}
