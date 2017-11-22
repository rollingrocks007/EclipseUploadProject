package com.selenium1.demo1.testcase;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class Reports {
	
	@Test
	public void reporsTest(Method m){
		
		System.out.println("Printing" + m.getName());
	}

}
