import java.util.Random;
import java.util.Scanner;

public class BankAccount {
	public static int nextAccountNumber;
	
	private String lastName;
	private int accountNumber;
	private double balance;
	private String firstName;
	public static void main(String[] args) {
		
	}
	public BankAccount(String lstName) {
		lastName = lstName;
		accountNumber = determineAccountNumber();
		balance = 0;
	}
	public BankAccount(String lstName, int initialDeposit) {
		this.lastName = lstName;
		balance = initialDeposit;
	
	}

	// Return account number for account
	public String getLastName() {
		return this.lastName;
	}
	// Return balance in account
	public int getAccountnumber() {
		return this.accountNumber;
	}
	// Return balance in account
	public double getBalance() {
		return this.balance;
	}
	// Assign name in account
	public void setLastName(String newName) {
		this.lastName = newName;
	}
	// Determine unique account number for account
	public static int determineAccountNumber() {
		Random account = new Random();
		return account.nextInt(9999999);
	}
	// Assign balance to account
	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}
	// Add Money to account balance
	public void deposit(double amount) {
		this.balance += amount;
	}
	//Withdraw money from account balance. If the account balance
	//stays > $25.00 it will allow you to withdraw
	public void withdraw(double amount) {
		if ((this.balance -= amount) > 0) {
			this.balance -= amount;
		}
	}
}
