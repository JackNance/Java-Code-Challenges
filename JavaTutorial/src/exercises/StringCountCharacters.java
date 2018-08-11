package exercises;

import java.util.HashMap;



public class StringCountCharacters {
	//METHOD IS CASE SENSITIVE.  CAN CHANGE USING toLowerCase() OR toUpperCase()
	static void characterCount(String inputString) {
		// Creating a HashMap containing char as a key and occurrences as a value
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		// Converting given string to char array
		char[] strArray = inputString.toCharArray();
		// checking each char of strArray
		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				// If char is present in charCountMap, incrementing it's count by 1
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				// put this char to map with 1 as it's value
				charCountMap.put(c, 1);
			}
		}
		// Printing the charCountMap
		System.out.println("here are the counts: " + charCountMap);
		int repeatingChars = 0;
		int total = 0;
		for(int i : charCountMap.values()) {
			if(i > 1) {
				repeatingChars++;
				total += i;
			}
		}
		System.out.println(repeatingChars + " different characters were repeated in this string for a total of " 
				+ total + " times.");

	}

	public static void main(String[] args) {
		characterCount("Java J2EE Java JSP J2EE");
		characterCount("All Is Well");
		characterCount("Done And Gone");
	}
}