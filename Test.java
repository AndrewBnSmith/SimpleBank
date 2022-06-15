package com.andrewsmith.bankaccount;

public class Test {
	public static void main(String[] args) {
		
	BankAccount user1 = new BankAccount();
	
	
	user1.accountDeposit("Savings", 50.50);
	user1.accountDeposit("Checking", 50.50);
	user1.accountDeposit("Checking", 50.50);

	
	user1.accountWithdrawal("Checking", 20.00);

	
	
	
	user1.myBalance();
	
	
	
	}
}