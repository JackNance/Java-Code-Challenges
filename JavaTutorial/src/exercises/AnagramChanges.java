package exercises;

import java.util.Scanner;

public class AnagramChanges {
	
//	REMOVE EXTRA CHARACTERS TO MAKE 2 STRINGS ANAGRAMS OF EACH OTHER

	    private static final Scanner scanner = new Scanner(System.in);

//	    public static void main(String[] args) { 
//	        System.out.println("Enter first string:");
//	    	String a = scanner.nextLine();
//	    	System.out.println("Enter next string:");
//	        String b = scanner.nextLine();
//
//	        System.out.println(makeAnagram(a.toLowerCase(), b.toLowerCase()));
//	        scanner.close();
//	    }
	    
	    public static void main(String args[]) {
	    	System.out.println("Please enter a string:");
	    	String stringA = scanner.nextLine();
	    	System.out.println("Please enter next string:");
	    	String stringB = scanner.nextLine();	    	
	    	scanner.close();
	    	
	    	System.out.println(makeAnagram(stringA, stringB));
	    }
	
//		Array letters is of length 26, and stores the "frequencies" of letters in the string one. We index the array by the distance from the letter 'a'. So in letters
	    //
//	    	['a'-'a']=letters[0] we will store the number of a's in string one. 
//	    	letters['b'-'a']=letters[1] the number of b's
//	    	letters['g'-'a']=letters[6] the number of g's and so on. 
	    //
//	    	letters[c-'a']++ is a postfix notation and means the same as letters[c-'a']=letters[c-'a']+1, so we just encountered a letter and we add 1 to the corresponding slot. 
//	    	Same with letters[c-'a']--, but this time we subtract all the frequencies in the string two. This way, if there were 3 d's in string one and 5 d's in string two, the 
	    //
//	    	4th slot in letters will be letters[3]=-2, but then we take care of it, by applying Math.abs
	    	    
	    public static int makeAnagram(String stringA, String stringB) {
	    	int[] letters = new int[26];
	    	
	    	for(char c : stringA.toLowerCase().toCharArray()) {
	    		letters[c - 'a']++;
	    	}
	    	
	    	for(char c : stringB.toLowerCase().toCharArray()) {
	    		letters[c - 'a']--;
	    	}
	    	
	    	int sum = 0;
	    	for(int i : letters) {
	    		sum += Math.abs(i);
	    	}
	    	
	    	return sum;
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
//	    static int makeAnagram(String a, String b) {
//	    	        int[] lettercounts = new int[26];
//	    			for(char c : a.toCharArray()){
//	    				lettercounts[c-'a']++;
//	    			}
//	    			for(char c : b.toCharArray()){
//	    				lettercounts[c-'a']--;
//	    			}
//	    			int result = 0;
//	    			for(int i : lettercounts){
//	    				result += Math.abs(i);
//	    			}
//	    			return result;
//	    	    }

}
