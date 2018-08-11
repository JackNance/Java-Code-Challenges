package exercises;

public class BankAccount {

	private String accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void depositFunds(double amount) {
		this.balance += amount;
		System.out.println("The new account balance is " + this.balance);
	}
	public void withdrawFunds(double amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
			System.out.println("The new account balance is " + this.balance);
		}else {
			System.out.println("There are insufficient funds to withdraw " + amount);
		}
	}
		
}
