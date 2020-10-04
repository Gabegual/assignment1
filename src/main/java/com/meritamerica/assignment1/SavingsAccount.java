package com.meritamerica.assignment1;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class SavingsAccount {
	private double balance = 0;
	private double interestRate = 0.01;
	private double FV = 0;
	private int years = 0;

	
	public SavingsAccount(double StartingBalance) {
		balance = StartingBalance;
	}
	
	public double getBalance() {
		return balance;

	}

	public double getInterestRate() {
		return interestRate;
	}

	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Your current balance is now $" + balance);
			return true;
		} else {
			System.out.println("You can not withdraw more than your current balance $" + balance);
			return false;
		}

	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("your current balance is now $" + balance);
			return true;
		} else {
			System.out.println("You can not deposit an amount less than zero");
			return false;
		}

	}

	public double futureValue(int years) {
		double value = 0.00;
		this.years = years;
		double powered = Math.pow((1 + interestRate), years);
		value = balance * powered;
		FV = value;
		return FV;
	}

	public String toString() {
		double FV = futureValue(years);
    	DecimalFormat df = new DecimalFormat("0.##");
		return "Savings Account Balance: " + df.format(balance) + 
				"\n Savings Account Interest Rate: " + interestRate
				+ "\n Savings Account Balance in " + years + " years: " + df.format(FV);

	}
}
