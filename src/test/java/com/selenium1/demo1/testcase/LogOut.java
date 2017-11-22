package com.selenium1.demo1.testcase;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class LogOut {
	
	@Test
	public void logoutTest(Method m){
		
		System.out.println("Printing" + m.getName());
		
	}

}
