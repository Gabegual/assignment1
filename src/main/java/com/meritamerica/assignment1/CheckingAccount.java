package com.meritamerica.assignment1;

import java.math.BigDecimal;
/*CheckingAccount(double openingBalance)
double getBalance()
double getInterestRate()
boolean withdraw(double amount)
boolean deposit(double amount)
double futureValue(int years)
String toString()
Sample output:
Checking Account Balance: $100
Checking Account Interest Rate: 0.0001
Checking Account Balance in 3 years: $100.03
*/

public class CheckingAccount {
	private double balance=0;
	private double interestRate=0.0001;
	private double FV =0;
	private int years=0;


	
	public void getBalance(double OpenBalance) {
		balance = OpenBalance;

	}

	public double getInterestRate() {
		return interestRate;
	}

	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Your current balance is now $"+ balance);
			return true;
		} else {
			System.out.println("You can not withdraw more than your current balance $"+ balance);
			return false;
		}

	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("your current balance is now $"+ balance);
			return true;
		} else {
			System.out.println("You can not deposit an amount less than zero");
			return false;
		}

	}

	public double futureValue(int years) {
		double value = 0.00;
		this.years = years;
		double powered = Math.pow((1 + 0.0001), years);
		value = balance * powered;
		BigDecimal formatingFV = new BigDecimal(value).setScale(2, BigDecimal.ROUND_HALF_UP);
		FV = formatingFV.doubleValue();
		return FV;
	}
	
	public String toString() {
		double FV =futureValue(years);
		return "Checking Account Balance: " +balance + "\n Checking Account Interest Rate: "+interestRate +
				"\n Checking Account Balance in "+ years +" years: "+FV;
		
	}
}