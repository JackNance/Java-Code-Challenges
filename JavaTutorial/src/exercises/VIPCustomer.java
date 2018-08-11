package exercises;

public class VIPCustomer {
	
	private String name;
	private double creditLimit;
	private String email;
	
	public VIPCustomer() {
		this("Default Name", 10_000, "Default Email");
	}
	public VIPCustomer(String name, String email) {
		this(name, 10_000, email);
	}
	
	public VIPCustomer(String name, double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public String getEmail() {
		return email;
	}
	
}
