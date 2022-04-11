/*
 * Date:        2/3/2022
 * File:        SavingsAccount.java
 * Description: A program used on an ATM that can run deposits, show weekly
 * 				interest rates, and view account details. This class features
 * 				data field encapsulation, constructors, accessors, and mutators
 * 				It also has a method to calculate weekly interest rate and
 * 				a method to calculate balance after deposit is added.
 */

import java.util.Scanner;

public class SavingsAccount {
	
	Scanner input = new Scanner(System.in);
	
	//private data fields
	private double balance;
	private int id;
	private double annualIntRate;
	private Date date = new Date();
	
	//create default account constructor
	public SavingsAccount() {
		
	}
	
	//constructor with specified id and initial balance
	public SavingsAccount(int specifiedId, double initialBalance, double intRate) {
				balance = initialBalance;
				id = specifiedId;
				annualIntRate = intRate;
				
	}

	//accessors for id, balance, and annual rate
	public double getBalance() {
		return balance;
	}

	public int getId() {
		return id;
	}

	public double getAnnualIntRate() {
		return annualIntRate;
	}

	//mutators for id, balance, and annual rate
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAnnualIntRate(double annualIntRate) {
		this.annualIntRate = annualIntRate;
	}
	
	//accessor methods for dateEstablished
	public void getDateEstablished() {
		System.out.println(date.toString());
	}
	
	//method that returns weekly interest rate
	public double getWeeklyIntRate() {
		double weeklyInterestRate = (annualIntRate/100)/52;
		return (weeklyInterestRate * balance);
	}
	
	//method that deposits amount into account
	public double deposit(double deposit) {
		balance += deposit;
		return balance;
	}
	
}
