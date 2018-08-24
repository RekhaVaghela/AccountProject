package com.qa.quickstart.accountProject;

import junit.framework.TestCase;

public class AppTest extends TestCase{
	public void test(){
		int actual_value;
		serviceClass service = new serviceClass();
		service.addaccountClasstoMap(new accountClass("Rekha" , "Vaghela" , 1234));
		service.addaccountClasstoMap(new accountClass("Jess" , "Williams" , 1122));
		service.addaccountClasstoMap(new accountClass("Jess" , "Williams" , 1123));
		actual_value = service.getTotalfirstName("Jess");
		assertEquals(2,actual_value);
	}
	
}
