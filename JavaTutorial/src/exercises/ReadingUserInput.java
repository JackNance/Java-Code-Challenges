package exercises;

import java.util.Scanner;

public class ReadingUserInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int counter = 0;
		int sum = 0;
		
		while(true) {
			System.out.println("Enter number #" + (counter + 1) + ":");
			boolean isInt = scan.hasNextInt();
			if(isInt) {
				int number = scan.nextInt();
				counter++;
				sum += number;	
				if(counter == 10) {
					break;
				}
			}
			else {
				System.out.println("Please enter a valid number.");
			}
			scan.nextLine();
		}
		
		scan.close();
		System.out.println("The sum of the 10 numbers is: " + sum);

	}

}
