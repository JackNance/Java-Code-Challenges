package BankingDemo;

import java.util.ArrayList;

public class Customer {

	private String name;
	private ArrayList<Double> transactionList;
	
	public Customer(String name, double initialAmount) {
		super();
		this.name = name;
		//CREATE ARRAY LIST FOR CUSTOMER
		this.transactionList = new ArrayList<Double>();
		//ADD INITIAL AMOUNT TO TRANSACTION LIST
		addTransaction(initialAmount);
	}
	
	public void addTransaction(double amount) {
		this.transactionList.add(amount);
	}

	public String getName() {
		return name;
	}

	public ArrayList<Double> getTransactionList() {
		return transactionList;
	}
	
	
}
