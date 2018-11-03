package com.aop.main;

import org.springframework.stereotype.Component;

@Component("mainprogram")
public class MainProgram {
	public void mainProcess() {
		System.out.println("main functions are running");
		/*
		 * do something
		 * 
		 * 
		 */
		System.out.println("main functions are ended here");
	}
}
