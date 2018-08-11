package exercises;

import java.security.KeyStore.Entry;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class ArrayFrequency {
	
	public static void main(String args[]) {
		char[] c = {'a', 'b', 'c', 'd', '4', '5', '6', '7', 'a', 'd', 'c', 'a', 'c'};
		
		//CHECK FOR COUNT OF SPECIFIC CHARACTER
		char check = '4';
		int count = 0;
		for(char character : c) {
			if( character == check)
				count++;
		}
		System.out.println(check + " occurs " + count + " times in the array.");
		
		Integer[] arr = {4, 1, 4, 1, 3};
		Map<Integer,Integer> integersCount = new HashMap<Integer,Integer>();

		for (Integer i : arr){
		    if (!integersCount.containsKey(i))
		        integersCount.put(i, 1);
		    else
		        integersCount.put(i, integersCount.get(i) + 1);
		    }		
		
	}
	
	 
	public static Map.Entry getMostCommonChar(String phrase) {
	    if (phrase == null || phrase.isEmpty()) {
	        throw new IllegalArgumentException("input phrase must have non-empty value.");
	    }

	    char maxchar = ' ';
	    int counter = 0;
	    int[] ascii_count = new int[Character.MAX_VALUE];  // fast path for ASCII

	    for (int i = 0; i < phrase.length(); i++) {
	        char ch = phrase.charAt(i);  // This does appear to be the recommended way to iterate over a String
	        if (ascii_count[ch]++ >= counter) {
	            counter = ascii_count[ch];
	            maxchar = ch;
	        }
	    }

	    Map.Entry<Character,Integer> e = new AbstractMap.SimpleEntry<>(maxchar,counter);

	    System.out.println(e.getKey());
	    System.out.println(e.getValue());

	    return e;
	}    
	
}
