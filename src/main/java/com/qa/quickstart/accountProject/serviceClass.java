package com.qa.quickstart.accountProject;


import java.util.HashMap;
import java.util.Map;



import com.google.gson.Gson;

public class serviceClass {
	private Map<Integer,accountClass> accountClassMap;
	private static int counter = 1;
	
	public serviceClass() {
		accountClassMap = new HashMap<Integer, accountClass>();
				
		
				
	}
	
	public void addaccountClasstoMap(accountClass accountClasstoadd) {
		accountClassMap.put(counter, accountClasstoadd);
		counter++;
	}
	
	public accountClass gettingAccount(int key) {
		return accountClassMap.get(key);		
	}
	public Map<Integer, accountClass> gettingaccountClassMap() {
		return accountClassMap;		
	}
}
