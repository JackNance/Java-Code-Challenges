package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMoveElementToEnd {

	public static void main(String[] args) {
		ArrayList<Integer> ints = new ArrayList<Integer>(
				Arrays.asList(0, 1, 2, 0, 7, 0, 3, 0, 0, 0));
			  
		
		for(int i = 0; i < ints.size(); i ++) {
			if( ints.get(i)== 0) {
				ints.remove(i);
				ints.add(0);
			}
		}
		
		System.out.println("Elements are:"+ ints);
		for(int i : ints) {
			System.out.print(i);
		}
	}

}
