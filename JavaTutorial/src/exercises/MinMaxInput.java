package exercises;

import java.util.Scanner;

public class MinMaxInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int min = 0;
		int max = 0;
		boolean firstNumber = true;
		
		while(true) {
			System.out.println("Please enter a number:");
			boolean isInt = scan.hasNextInt();
			
			
			
			if(isInt) {
				int num = scan.nextInt();
				if(firstNumber) {
					firstNumber = false;
					min = num;
					max = num;
				}
				
				if(num > max) {
					max = num;
				}
				if(num < min) {
					min = num;
				}				
			}
			else {
				if(!firstNumber) {
					System.out.println("The smallest number you entered was: " + min);
					System.out.println("The largest number you entered was: " + max);
				}
				else {
					System.out.println("No valid numbers were entered.");
				}
				break;
			}
			scan.nextLine();
		}
		scan.close();
		
	}
}
