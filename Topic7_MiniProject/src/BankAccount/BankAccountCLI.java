package BankAccount;

import java.util.Scanner;

public class BankAccountCLI {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Create a new Account");
		
		
		System.out.println("Write your name");
		
		String customerName = scan.nextLine();
		
		System.out.println("Write your address");
		
		String customerAddress = scan.nextLine();
		
		Customer dario = new Customer(customerName, customerAddress);
		
		System.out.println("Name/type of the account");
		
		String bankAccountName = scan.nextLine();
		
		System.out.println("Initial Balance");
		
		double balance = scan.nextDouble();
		
		int darioBankAccount = dario.createBankAccount(bankAccountName, balance);
		
		// Option System
		
		
		dario.bankAccount.optionSystem();
		
		scan.close();
		
		
		
	}
}
