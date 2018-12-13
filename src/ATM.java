/**
 * Just like last time, the ATM class is responsible for managing all
 * of the user interaction. This means login procedures, displaying the
 * menu, and responding to menu selections. In the enhanced version, the
 * ATM class will have the added responsibility of interfacing with the
 * Database class to write and read information to and from the database.
 * 
 * Most of the functionality for this class should have already been
 * implemented last time. You can always reference my Github repository
 * for inspiration (https://github.com/rwilson-ucvts/java-sample-atm).
 */

import java.util.Scanner;

public class ATM{
	
	Scanner input = new Scanner(System.in);
	public void PreMenu(){
		System.out.println("Press 1 to open an account\npress 2 to login\npress 3 to exit");
		int i = input.nextInt();
		String eat = input.nextLine();
		if (i == 1) {
				Database.updateAccount();
		}
	}
	public void menu(BankAccount test, User test2) {
		System.out.println("Input your account number");
		int accountnum = input.nextInt();
		String eat = input.nextLine();
		if(accountnum == test.getaccountNumber()) {
			System.out.println("Input your pin");
			int pin = input.nextInt();
			input.nextLine();
			if (pin == test2.getPin()) {
				int i = 0;
				do {
					System.out.println("you have $" + test.getbalance() + " in your account \n 1: deposit\n 2: withdraw\n 3: show balance\n 0: exit terminal");
					int use = input.nextInt();
					input.nextLine();
					
						switch(use) {
							case (0):
								i = 1;
								break;
							case (1):
								deposit(test);
								break;
							case (2):
								withdraw(test);
								break;
							case (3):
								showBalance(test);
								break;
							case (4):
								break;
							default:
								System.out.println("Invalid");
								break;
						}
					}while (i != 1);
			}
			
		}
	}
		
	
	public void deposit(BankAccount test) {
		System.out.println("How much do you want to deposit?");
		Long depositAmount = input.nextLong();
		System.out.println(depositAmount);
		String eat = input.nextLine();
		if(depositAmount == 0) {
			System.out.println("Please deposit a value");
		}
		else {
			test.deposit(depositAmount);
		}
		
		
	}
	public void withdraw(BankAccount test) {
		System.out.println("How much do you want to withdraw?");
		Long withdrawAmount = input.nextLong();
		input.nextLine();
		if(withdrawAmount == 0) { 
			System.out.println("Please withdraw a value");
		}
		if (withdrawAmount > test.getbalance()) {
			System.out.println("insufficient funds");
		}
		else {
			test.withdraw(withdrawAmount);
		}
		
	}
	public void showBalance(BankAccount test) {
		System.out.println("You currently have $" + test.getbalance() +" dollars in your account");
		
	}
	
	public static void main (String[] args) {
		
		ATM current = new ATM();
		current.PreMenu();
		current.menu();
	}
	
}