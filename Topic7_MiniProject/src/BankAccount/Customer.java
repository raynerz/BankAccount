package BankAccount;

public class Customer {
	private String customerName;
	private String customerAddress;
	BankAccount bankAccount;
	
	public Customer (String customerName, String customerAddress) {
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		
	}
	
	public int createBankAccount (String bankAccountName, double initialBalance) {
		BankAccount bankAccount = new BankAccount(bankAccountName, initialBalance);
		this.bankAccount = bankAccount;
		
		System.out.println("Your account has been created with ID: " + bankAccount.getId());
		return bankAccount.getId();
	}
	
	public BankAccount getBankAccount() {
		return bankAccount;
	}
	
	
	
}
