import java.util.Scanner;

/************************
* Savings Account Class *
*************************/
public class SavingsAccount {
	
	//private data fields
	private double balance;
	private int id;
	private double annualIntRate;
	//Date object for the getDateEstablished method
	private Date date = new Date();
	
	//create default account constructor
	public SavingsAccount() {
		
	}
	
	//Constructor that takes user's account ID, initial balance, and current interest rate.
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
	
	//accessor methods for dateEstablished. There is no setter method since the data of the date shouldn't be changed.
	public void getDateEstablished() {
		System.out.println(date.toString());
	}
	
	//Method that calculates the weekly interest rate
	public double getWeeklyIntRate() {
		double weeklyInterestRate = (annualIntRate/100)/52;
		return (weeklyInterestRate * balance);
	}
	
	//Method that deposits money into an account and calculates the total.
	public double deposit(double deposit) {
		balance += deposit;
		return balance;
	}
	
}
