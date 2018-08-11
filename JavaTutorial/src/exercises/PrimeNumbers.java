package exercises;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to get prime number");
		int n = scan.nextInt();
		scan.close();
		for (int i = 0; i < n; i++) {
			if (IsPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static boolean IsPrime(int n) {
		if (n > 2 && n % 2 == 0) {
			return false;
		}
		int top = (int) Math.sqrt(n) + 1;
		for (int i = 3; i < top; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
