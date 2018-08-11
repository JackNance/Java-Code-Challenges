package BankingDemo;

import java.util.ArrayList;

public class Bank {
	
	private String name;
	private ArrayList<Branch> branchList;

	public Bank(String name) {
		super();
		this.name = name;
		this.branchList = new ArrayList<Branch>();
	}
	
	public boolean addBranch(String branchName) {
		if(findBranch(branchName)== null) {
			this.branchList.add(new Branch(branchName));
			return true;
		} 
		return false;		
	}
	
	public boolean addCustomer(String branchName, String customerName, double initialAmount) {
		Branch branch = findBranch(branchName);
		if(branch != null) {
			return branch.addCustomer(customerName, initialAmount);
		}
		return false;
	}
	
	public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
		Branch branch = findBranch(branchName);
		if(branch != null) {
			return branch.addTransaction(customerName, amount);
		}
		return false;
	}
	
	private Branch findBranch(String branchName) {
		for(int i = 0; i < this.branchList.size(); i++) {
			Branch checkedBranch = this.branchList.get(i);
			if(checkedBranch.getBranchName().equals(branchName)){
				return checkedBranch;
			}
		}
		return null;
	}
	
}
