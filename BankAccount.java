package com.andrewsmith.bankaccount;


public class BankAccount {
	
	
	private Double checkingBalance = 0.0;
	private Double savingsBalance = 0.0;
	private static int accountsCreated = 0;
	private static Double totalMoney = 0.0;
	
	
	public BankAccount() {
		
		Double checkingBalance = 0.0;
		Double savingsBalance = 0.0;
		accountsCreated +=1;
		System.out.println("New user created");
		System.out.println("Total accounts created: " + accountsCreated + ".");		
	}
	
	
	public Double getCheckingBalance() {
		return checkingBalance;
	}
	public Double getSavingsBalance() {
		return savingsBalance;
	}

	
	public void setCheckingBalance(Double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public void setSavingsBalance(Double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	
	public void accountDeposit(String type, Double depositAmount) {
		if(type.equals ("checking") || type.equals ("Checking")) {
			setCheckingBalance(getCheckingBalance() + depositAmount);
			totalMoney += depositAmount;
		}
		if(type.equals ("savings") || type.equals ("Savings")) {
			setSavingsBalance(getSavingsBalance() + depositAmount);
			totalMoney += depositAmount;
		}
		else {
			System.out.println("Please choose apporpiate account type.");
		}	
	}
	
	public void accountWithdrawal(String type, Double withdrawalAmount) {
		if(type.equals ("checking") || type.equals("Checking")) {
			if(getCheckingBalance() < withdrawalAmount) {
				System.out.println("Insufficient Funds");
			}
			else {
			setCheckingBalance(getCheckingBalance() - withdrawalAmount);
			totalMoney -= withdrawalAmount;
			}
		}
		if(type.equals("savings") || type.equals("Savings")) {
			if(getSavingsBalance() < withdrawalAmount) {
				System.out.println("Insufficient Funds");
			}
			else {
			setSavingsBalance(getSavingsBalance() - withdrawalAmount);
			totalMoney -= withdrawalAmount;
			}
		}
	}
	public Double myBalance() {
		Double totalBalance = checkingBalance + savingsBalance;
		System.out.println(totalBalance);
		return totalBalance;
	}
}