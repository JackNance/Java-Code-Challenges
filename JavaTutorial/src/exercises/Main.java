package exercises;

public class Main {

	public static void main(String[] args) {
//		BankAccount checking = new BankAccount();		
//		checking.depositFunds(100.89);
//		checking.withdrawFunds(35.90);
//		checking.withdrawFunds(102);

		VIPCustomer jerrySeinfeld = new VIPCustomer();
		System.out.println(jerrySeinfeld.getCreditLimit());
		System.out.println(jerrySeinfeld.getName());
		System.out.println(jerrySeinfeld.getEmail());
		
		VIPCustomer jerryLewis = new VIPCustomer("Jerry Lewis", 5_000_000, "jerry@jerry");
		System.out.println(jerryLewis.getCreditLimit());
		System.out.println(jerrySeinfeld.getName());
		System.out.println(jerrySeinfeld.getEmail());
		
		VIPCustomer jerryLeeLewis = new VIPCustomer("Jerry Lee", "jlee@hulu");
		System.out.println(jerryLeeLewis.getCreditLimit());
		System.out.println(jerryLeeLewis.getName());
		System.out.println(jerryLeeLewis.getEmail());
		
	}

}
