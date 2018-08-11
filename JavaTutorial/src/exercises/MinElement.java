package exercises;

import java.util.Scanner;

public class MinElement {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("How many integers do you want to enter?");
		int count = scan.nextInt();
		scan.nextLine();
		int[] theArray = readIntegers(count);
		System.out.println("The smallest value in the array is:");
		System.out.println(findMin(theArray));
	}
	
	public static int[] readIntegers(int count) {
		int[] a = new int[count];
		for(int i = 0; i < count; i++) {
			System.out.println("Please enter an i3nteger:");
			a[i] = scan.nextInt();
			scan.nextLine();
		}
		scan.close();
		return a;
	}

	public static int findMin(int[] a) {
		int min = Integer.MAX_VALUE;
		for(int i : a) {
			if(i < min) {
				min = i;
			}
		}
		return min;
	}
}
