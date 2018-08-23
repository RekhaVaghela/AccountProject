package com.qa.quickstart.accountProject;

import com.google.gson.Gson;

public class printsHello {
	public static void main(String[] args) {
		
		System.out.println("Hello BAE Students");
		
		serviceClass service = new serviceClass();
		
		service.addaccountClasstoMap(new accountClass("Rekha" , "Vaghela" , 1234));
		service.addaccountClasstoMap(new accountClass("Jess" , "Williams" , 1122));
		
		Gson gson = new Gson(); 
		String json = gson.toJson(service.gettingaccountClassMap()); 
		System.out.println(json);
    }
}