package exercises;

import java.util.Arrays;

public class ListPlusList {

	public static void main(String args[]) {
		int[] l1 = { 1, 3, 5, 7, 0, 0, 0 };
		int[] l2 = { 2, 4, 6 };
		
		int l1Len = 3;
		int l2Len = 2;

		for (int i = l1.length -1; i > 0; i--) {
			if(l1[l1Len] > l2[l2Len]) {
				l1[i] = l1[l1Len];
				l1Len--;
			}
			else {
				l1[i] = l2[l2Len];
				l2Len--;
			}			
		}
	System.out.println(Arrays.toString(l1));
	
	}

}
