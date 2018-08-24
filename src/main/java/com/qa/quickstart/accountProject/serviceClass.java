package com.qa.quickstart.accountProject;

import java.util.HashMap;
import java.util.Map;

public class serviceClass {
	private Map<Integer,accountClass> accountClassMap;
	private static int counter = 0;
	
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

	public int getTotalfirstName(String searchName) {
		int result = 0;
		for (accountClass account: accountClassMap.values()) {
			if(account.getFirstname().equals(searchName)) {
				result++;
			}
		} return result;
		
	}
}
