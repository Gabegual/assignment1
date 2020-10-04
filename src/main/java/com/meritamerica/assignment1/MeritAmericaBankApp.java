package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	public static void main(String [] args) {
		AccountHolder MAB = new AccountHolder("Sadiq", "", "Fish", "560-43-0743", 100.00, 1000.00);
      System.out.println(MAB.toString());
      MAB.getCheckingAccount().deposit(500);
      MAB.getSavingsAccount().withdraw(800);
      System.out.println(MAB.getCheckingAccount().toString());
      System.out.println(MAB.getSavingsAccount().toString());
      
	}
	
}