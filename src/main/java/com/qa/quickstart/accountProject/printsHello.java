package com.qa.quickstart.accountProject;

public class printsHello {
	public static void main(String[] args) {
		
		System.out.println("Hello BAE Students");
		
		serviceClass service = new serviceClass();
		
		service.addaccountClasstoMap(new accountClass("Rekha" , "Vaghela" , 1234));
    }
}