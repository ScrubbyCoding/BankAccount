import java.util.Random;
import java.util.Scanner;

public class BankAccount {
	public static int nextAccountNumber = 0;
	
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
		accountNumber = determineAccountNumber();
	
	}

	// Return account number for account, instance accessor method
	public String getLastName() {
		return this.lastName;
	}
	// Return balance in account, this is an instance accessor method
	public int getAccountnumber() {
		return this.accountNumber;
	}
	// Return balance in account, this is an instance accessor method
	public double getBalance() {
		return this.balance;
	}
	// Assign name in account, this is an instance mutator method. newName being equal to last name is true in this instance
	public void setLastName(String newName) {
		this.lastName = newName;
	}
	// Determine unique account number for account, this is a static method
	public static int determineAccountNumber() {
		//Random account = new Random();
		//return account.nextInt(9999999);
		int accountReturn = nextAccountNumber;
		nextAccountNumber++;
		return accountReturn;
	}
	// Assign balance to account, this is an instance mutator method, balance is equal to newBalance in this instance
	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}
	// Add Money to account balance, this is an instance mutator method
	public void deposit(double amount) {
		this.balance += amount;
	}
	//Withdraw money from account balance. If the account balance
	//stays > $25.00 it will allow you to withdraw. This is an instance mutator method
	public void withdraw(double amount) {
		if ((this.balance - amount) > 25) {
			this.balance -= amount;
		}
	}
	
	// Transfer money from current bank account to another bank account
	//The method accepts two parameters: A second BankAccount to accept the
	//money, and a double number for the amount of money to transfer. The
	//method should modify the 2 BankAccount objects such that "this" current
	//object has its balance decreased by the given amount and the other
	//account's balance is increased by the given amount. If this object does not
	//have enough money to make the full transfer, transfer whatever money is left, but 
	//no balance should go below 0$ for a transfer. Also
	//transferAmount must be > 0.0 or no transfer is done
	
	//this is an instance mutator method
	public void transfer(BankAccount transferTo, double transferAmount) {
		if ((this.balance - transferAmount) >= 0) {
			this.balance -= transferAmount;
			transferTo.balance += transferAmount;
		}
		else if ((this.balance - transferAmount) < 0) {
			transferTo.balance += this.balance;
			this.balance -= this.balance;
		}
	}
	
	//toString method return a string that contains the account's name,
	//accountNumber and balance separate by a comma and a space. Use
	//"this". For example, if an account object name smith has the name 
	//"Smith" and balance 25.42, and call smith.toString() should return the 
	//string: "[Name=Smith, Account=1234, Balance=$25.42]"
	
	// This is an instance accessor method
	public String toString() {
		return "[Name=" + this.lastName + ", Account=" + this.accountNumber + ", Balance=$" + balance + "]";
	}
}
