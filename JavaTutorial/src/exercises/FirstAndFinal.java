package exercises;

public class FirstAndFinal {

	public static void main(String[] args) {
		//10- Print the first and final occurrence of a number in a sorted array of integers.
		
		int[] list = {8,2,3,4,5,5,7,8};
		int search = 8;
		int first = -1;
		int last = -1;
		
		for(int i = 0; i < list.length; i++) {
			if(list[i] == search) {
				first = i;
				break;
			}
		}
		
		for(int i = list.length - 1; i >= 0; i--) {
			if(list[i] == search) {
				last = i;
				break;
			}
		}
		
		System.out.println(search + " appears first at position " + first + " and last at position " + last);
	}

}
