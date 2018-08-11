package exercises;

import java.util.*;

public class StringCharacterFrequency {

	public static void main(String[] args) {
		HashMap<Character, Integer> h = new HashMap<Character, Integer>();
		String s = "This is a test that find the most common character";
		//String unique = new String();
		for (int i = 0; i < s.length(); i++) {
			if (h.containsKey(s.charAt(i))) {
				h.put(s.charAt(i), (int) h.get(s.charAt(i)) + 1);
			} else {
				h.put(s.charAt(i), 1);
				//unique += s.charAt(i);
			}
		}
	
		int max = 0;
		char mostFrequent = ' ';
		for(Map.Entry<Character, Integer> entry : h.entrySet()) {
			//PRINT OCCURRENCES OF EACH CHARACTER
			System.out.println(entry.getKey() + ": " + entry.getValue());
			if(entry.getValue() > max && entry.getKey() != ' ') {
		    	max = entry.getValue();
		    	mostFrequent = entry.getKey();
		    }		    
		}	
		//PRINT MOST FREQUENT CHARACTER AND NUMBER OF OCCURRENCES
		System.out.println(mostFrequent + ": " + max);
		
	}
}