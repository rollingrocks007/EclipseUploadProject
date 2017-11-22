package com.selenium1.demo1.testcase;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void loginTest(Method m){
		
		System.out.println("Printing" + m.getName());
		
	}
	

}
