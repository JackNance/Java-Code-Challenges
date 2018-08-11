package exercises;

import java.util.Arrays;

public class ReverseArrayChallenge {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		System.out.println("Here is the array: " + Arrays.toString(a));
		reverseArray(a);
		System.out.println("\nHere is the array in reverse order: " + Arrays.toString(a));
		
	}
	
	public static void reverseArray(int[] a) {
		int temp = 0;
		
		for(int i = 0; i < a.length/2; i++) {
			temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length-i -1] = temp;
		}
	}

}
