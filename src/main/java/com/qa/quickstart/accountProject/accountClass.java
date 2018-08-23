package com.qa.quickstart.accountProject;

public class accountClass {
	private String firstname;
	private String surname;
	private int accountNumber;
	
	public accountClass(String firstname, String surname, int accountNumber) {
		this.firstname = firstname;
		this.surname = surname;
		this.accountNumber = accountNumber;
				
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "accountClass [firstname=" + firstname + ", surname=" + surname + ", accountNumber=" + accountNumber
				+ "]";
	}
	
}
