/**
 * Just like last time, the BankAccount class is primarily responsible
 * for depositing and withdrawing money. In the enhanced version, there
 * will be the added requirement of transfering funds between accounts.
 * 
 * Most of the functionality for this class should have already been
 * implemented last time. You can always reference my Github repository
 * for inspiration (https://github.com/rwilson-ucvts/java-sample-atm).
 */

public class BankAccount {
	private double balance;
	private int accountNumber;
	private User accountUser;
	
	public BankAccount(double balance, int accountNumber, User accountUser) {
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.accountUser = accountUser;
	}
	public BankAccount(String account) {
		account = Integer.toString((int) balance) + Integer.toString(accountNumber)+ accountUser;
	}
	public double getbalance() {
		return balance;
	}
	public User getUser() {
		return accountUser;
	}
	public void setbalance(int balance) {
		this.balance = balance;
	}
	public void setaccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setUser(User accountUser) {
		this.accountUser = accountUser;
	}
	public void deposit(double value) {
		balance += value;
	}
	public void transfer(double value) {
		balance += value;
	}
	public void withdraw(double value) {
		balance -= value;
	}
	public int getaccountNumber() {
		// TODO Auto-generated method stub
		return accountNumber;
	}
}