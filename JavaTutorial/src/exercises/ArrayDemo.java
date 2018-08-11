package exercises;

import java.util.Scanner;

public class ArrayDemo {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] theArray = getIntegers(5);
		printArray(theArray);
		printArray(sortIntegers(theArray));

	}
	
	public static int[] getIntegers(int num) {
		int[] arr = new int[num];
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter an integer:");
			arr[i] = scanner.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] sortIntegers(int[] arr) {
		int[] reverseArray = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			reverseArray[i] = arr[i];
		}
		boolean flag = true;
		int temp;
		while(flag){
			flag = false;
			for(int i = 0; i < reverseArray.length - 1; i++) {
				if(reverseArray[i] < reverseArray[i + 1]) {
					temp = reverseArray[i];
					reverseArray[i] = reverseArray[i + 1];
					reverseArray[i + 1] = temp;
					flag = true;					
				}
			}
			
		}
		
		return reverseArray;
				
	}
}
