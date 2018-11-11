package BankAccount;

import java.util.Scanner;

public class BankAccount {
	@SuppressWarnings("unused")
	private String bankAccountName;
	private int bankAccountId;
	private double balance;
	
	
	public BankAccount(String bankAccountName, double balance){
		this.bankAccountName = bankAccountName;
		this.balance = balance;
		bankAccountId++;
	}
	
	public void putMoney(double amount) {
		balance += amount;
	}
	
	
	public void getMoney(double amount) {
		balance -= amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getId(){
		return bankAccountId;
	}
	
	public void optionSystem() {
		try {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type an option. (Options: balance, get, put, exit)");
		
		String option = scan.nextLine();
		
		if (option.equals("balance")) {
			System.out.println(getBalance());	
			optionSystem();
		} 
		
		else if (option.equals("get")) {
			System.out.println("Amount to withdraw");
			
			double withdraw = Double.parseDouble(scan.next());
			
			getMoney(withdraw);
			
			System.out.println("Your new balance is: " + getBalance());
			optionSystem();
		} 
		
		else if (option.equals("put")) {
			System.out.println("Amount to put");
			
			double put = Double.parseDouble(scan.next());
			
			putMoney(put);
			
			System.out.println("Your new balance is: " + getBalance());
			optionSystem();
			
		} else if (option.equals("exit")) {
			System.out.println("Thanks for your trust, goodbye");
			System.exit(1);
		}
		
		else {
			System.out.println("Not a valid option");
			optionSystem();
		}
		
		scan.close();
		} catch (NumberFormatException e){
			System.out.println("When putting or withdrawing money, only numbers are allowed");
			optionSystem();
		}
	}
	
}
