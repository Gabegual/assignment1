package com.meritamerica.assignment1;

import java.math.*;
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
	private double balance;

	public double getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return 0.0001;
	}

	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			return true;
		} else {
			return false;
		}

	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		} else {
			return false;
		}

	}

	public double futureValue(int years) {
		double value = 0.00;
		double powered = Math.pow((1 + 0.0001), years);
		value = balance * powered;
		BigDecimal FV = new BigDecimal(value).setScale(2, BigDecimal.ROUND_HALF_UP);
		return FV.doubleValue();
	}
}