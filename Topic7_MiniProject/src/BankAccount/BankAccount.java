package BankAccount;

public class BankAccount {
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
	
	
	
}
