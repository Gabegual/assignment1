package com.meritamerica.assignment1;

import java.text.DecimalFormat;

public class AccountHolder {
	
	private static final double CheckingAccountOpeiningBalance = 0;
	private String firstName = "";
	private String middleName = "";
	private String lastName = "";
	private String ssn = "";
	CheckingAccount checkingaccount = null;  
	SavingsAccount savingAccount = null;
	private CheckingAccount savingsAccount;
	
		

	public AccountHolder () {
		System.out.println("This is my AccountHolder Constructor");
	}
	public AccountHolder(String firstName, String middleName, String lastName, String ssN, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
	
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssN;
		this.checkingaccount = new CheckingAccount(checkingAccountOpeningBalance);
		this.savingAccount = new SavingsAccount(savingsAccountOpeningBalance);
		
		
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setssn(String ssn) {
		this.ssn = ssn;
	}
	public String getssn() {
		return ssn;
		
	}
	
	public CheckingAccount getCheckingAccount() {
		return checkingaccount;
		
	}
	
	public SavingsAccount getSavingsAccount() {
		return savingAccount;
		
		
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.##");
		return "Name: "+firstName+" "+middleName+" "+lastName+"\n SSN: "+ ssn + 
				"\n Checkings Account Balance: "+df.format(checkingaccount.getBalance())+
				"\n Checking Account Intrest Rates: "+checkingaccount.getInterestRate()+
				"\n Checking Account Balance In Three Years: "+df.format(checkingaccount.futureValue(3))+
				"\n Savings Account Balance: "+df.format(savingAccount.getBalance())+
				"\n Savings Account Intrest Rates: "+savingAccount.getInterestRate()+
				"\n Savings Account Balance In Three Years: "+df.format(savingAccount.futureValue(3));
				
	}
	
	

	
}