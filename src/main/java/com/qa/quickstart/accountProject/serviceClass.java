package com.qa.quickstart.accountProject;

import java.util.HashMap;
import java.util.Map;

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
	
	public void gettingAccount(accountClass accountClassToGet) {
		accountClassMap.get(counter);		
	}
}
