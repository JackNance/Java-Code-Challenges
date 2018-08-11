package exercises;

import java.util.Arrays;

public class ReverseString {

	public static void main(String args[]) {
		String s = "Eugene Still was here";
		System.out.println(revCharArray(s));
		System.out.println(revStringBuilder(s));
		revChar(s);
	}
	
	//**SORT** STRING - CONVERT TO CHAR ARRAY, SORT ARRAY, CONVERT ARRAY TO STRING
	public static String revCharArray(String s) {
		char[] ar = s.toCharArray();
		Arrays.sort(ar);
		String sorted = String.valueOf(ar);
		return sorted;
	}
	
	//REVERSE STRING - CONVERT TO CHAR ARRAY, SORT ARRAY WITHOUT BUILT IN SORT CONVERT ARRAY TO STRING
	public static void revChar(String s)
    {
       
        // convert String to character array
        // by using toCharArray
        char[] try1 = s.toCharArray();
 
        for (int i = try1.length-1; i>=0; i--)
            System.out.print(try1[i]);
    }
		
	
	//REVERSE WITH STRINGBUILDER
	public static String revStringBuilder(String s) {
		//CREATE NEW STRINGBUILDER
		StringBuilder input1 = new StringBuilder();
        input1.append(s);
        return input1.reverse().toString();
	}
	
}
