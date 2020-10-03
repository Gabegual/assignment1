package com.meritamerica.assignment1;

import java.math.BigDecimal;

public class SavingsAccount {
	private double balance = 0;
	private double interestRate = 0.01;
	private double FV = 0;

	public void getBalance(double OpenBalance) {
		balance = OpenBalance;

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
		double powered = Math.pow((1 + 0.0001), years);
		value = balance * powered;
		BigDecimal formatingFV = new BigDecimal(value).setScale(2, BigDecimal.ROUND_HALF_UP);
		FV = formatingFV.doubleValue();
		return FV;
	}

	public String toString(int years) {
		double FV = futureValue(years);
		return "Savings Account Balance: " + balance + "\n Savings Account Interest Rate: " + interestRate
				+ "\n Savings Account Balance in " + years + " years: " + FV;

	}
}
