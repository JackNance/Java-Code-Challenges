package BankingDemo;

import java.util.ArrayList;

public class Branch {
	private String branchName;
	private ArrayList<Customer> customerList;

	public Branch(String branchName) {
		super();
		this.customerList = new ArrayList<Customer>();
		this.branchName = branchName;
	}
	
	public boolean addCustomer(String name, double transaction) {
		if(findCustomer(name) == null) {
			this.customerList.add(new Customer(name, transaction));
			return true;
		}
		return false;
	}
	
	public boolean addTransaction(String name, double transaction) {
		Customer existingCustomer = findCustomer(name);
		if(existingCustomer != null) {
			existingCustomer.addTransaction(transaction);
			return true;
		} 
		return false;
	}
	
	private Customer findCustomer(String customerName) {
		for(int i = 0; i < this.customerList.size(); i++) {
			Customer checkedCustomer = this.customerList.get(i);
			if(checkedCustomer.getName().equals(customerName)){
				return checkedCustomer;
			}
		}
		return null;
	}

	public String getBranchName() {
		return branchName;
	}

	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}
	
	
	
}
