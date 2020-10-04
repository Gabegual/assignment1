package com.meritamerica.assignment1;

public class AccountHolder {
	
	private String firstName = "";
	private String middleName = "";
	private String lastName = "";
	private String ssn = "";
	private double checkingAccountOpeningBalance = (); 
	private double savingsAccountOpeningBalance = ();
	
		

	public AccountHolder () {
		System.out.println("This is my AccountHolder Constructor");
	}
	public AccountHolder(String firstName, String middleName, String lastNmae, String ssN, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		AccountHolder firstName1 = new AccountHolder();
		firstName1 = firstName1;
		System.out.println(firstName1);
		
		AccountHolder middleName1 = new AccountHolder();
		  middleName1 = middleName1;
		System.out.println(middleName1);
		
		AccountHolder manji = new AccountHolder();
		manji.lastName = "Manji";
		System.out.println(Manji.lastName);
		
		
		
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

	public static void main(String [] args) {
		
	AccountHolder sadiq = new AccountHolder();
		sadiq.firstName = "Sadiq";
		System.out.println(sadiq.firstName);
		
		
	}
	
	//FirstName new firstName = Sadiq;
	//MiddleName new middleName = "";
	//LastName new lastName = Manji;

	
	
}