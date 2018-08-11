 package exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
	
	public static void main(String[] args) {
		String myString = "abcdefg";
		System.out.println(myString.replaceAll("^abc", "Y"));//^ will only match at the beginning of string
		
		String challenge1 = "I want a bike.";
		String challenge2 = "I want a ball."; 
		String challenge4 = "Replace all blanks with underscores.";
		String challenge5 = "aaabcccccccdddefffg";
		System.out.println(challenge1.matches("I want a bike."));
		System.out.println(challenge2.matches("^I[ ][a-z]{4}[ ]a[ ]b[a-z]{3}[.]")); 
		System.out.println(challenge2.matches("I want a \\w+."));// \\w will match all numbers, digits and underscore
		// + matches any number of repeating characters
		System.out.println(challenge2.matches("^I want a (bike|ball)."));//() contains a group, | is used for "OR"
		
//		String h1Pattern = "I want a \\w+.";//
//		Pattern pattern = Pattern.compile(h1Pattern);
//		Matcher matcher = pattern.matcher(challenge1);
//		System.out.println("Challenge 3: " + matcher.matches());
		
		Pattern pattern = Pattern.compile("I want a \\w+.");//CREATE PATTERN OBJECT AND COMPILE WITH EXPECTED PATTERN
		Matcher matcher = pattern.matcher(challenge1);//CREATE MATCHER OBJECT USING PATTERN OBJECT WITH STRING TO SEARCH AS PARAM
		System.out.println("Challenge 3: " + matcher.matches());//VALIDATE MATCH USING MATCHER OBJECT
		//NOTE .matches() HAS TO MATCH ON WHOLE STRING
		
		System.out.println(challenge4.replaceAll("[ ]", "_"));
		System.out.println(challenge4.replaceAll(" ", "_"));
		System.out.println(challenge4.replaceAll("\\s", "_"));// \\s is all white space, new lines, tabs, etc
		
		String c5Pattern = "[a-g]+";//1 or more occurrences of characters a through g
		Pattern pattern5 = Pattern.compile(c5Pattern);
		Matcher c5Matcher = pattern5.matcher(challenge5);
		System.out.println("Challenge 5: " + c5Matcher.matches());
		
		String challenge6RegEx = ("^a{3}bc{7}d{3}ef{3}g$");//^ start of string, {} quantifiers designate how many occurrences of
		//each char, $ to signify the end of string
		System.out.println("Challenge 6: " + challenge5.matches(challenge6RegEx));
		System.out.println("Challenge 6: " + challenge5.replaceAll(challenge6RegEx, "REPLACED"));
		System.out.println(challenge5);
		
		String challenge7 = "aabcd.1135";
		System.out.println("Challenge 7: " + challenge7.matches("^[a-z]+.[0-9]+"));
		System.out.println("Challenge 7: " + challenge7.matches("^[a-z]+\\.\\d+$"));// \\. escapes . \\d for any digit
		
		String challenge8 = "abCd.135uvXqz.7tzik.999";
		String regEx8 = "([A-Za-z]+\\.)(\\d+)";
		Pattern pattern8 = Pattern.compile(regEx8);
		Matcher matcher8 = pattern8.matcher(challenge8);
		
		while(matcher8.find()) {
			System.out.println(matcher8.group(2));//The whole pattern group string is group 0, then 
			// each subsequent group enclosed in an occurrence () is counted starting at 1.  group(2) is the second group of
			// characters inside ()
		}
		
		String challenge9 = "abCd.135\tuvXqz.7\ttzik.999\n";
		String regEx9 = "([A-Za-z]+\\.)(\\d+)(\\s)";
		Pattern pattern9 = Pattern.compile(regEx9);
		Matcher matcher9 = pattern9.matcher(challenge9);
		
		while(matcher9.find()) {
			System.out.println(matcher9.group(2));				
		}
		
		String challenge10 = "abCd.135\tuvXqz.7\ttzik.999\n";
		String regEx10 = "([A-Za-z]+\\.)(\\d+)(\\s)";
		Pattern pattern10 = Pattern.compile(regEx10);
		Matcher matcher10 = pattern10.matcher(challenge10);
		
		while(matcher10.find()) {
			System.out.println("Start: " + matcher10.start(2) + " End: " + (matcher10.end(2) - 1));	
			//start is the first position of the first matching digit character.
			//end is the position AFTER the last matching digit character.  So we subtract 1 to get the position of the last digit
		}
		
		//FIND ALL VALUES BETWEEN {}
		String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4},";
		Pattern pattern11 = Pattern.compile("\\{(.+?)\\}");//USE \\{ TO ESCAPE CURLY BRACES, "." MATCHES ANY CHARACTER
		//+ MATCHES ANY NUMBER OF CHARACTERS, ? IS LAZY QUANTIFIER AND STOPS AFTER FIRST OCCURRENCE OF CHARCTER AFTER THE MATCH
		//IF WE HADN'T USED THE LAZY QUANTIFIER THEN THE WHOLE STRING BETWEEEN FIRST { AND LAST } WOULD HAVE BEEN CAPTURED
		Matcher matcher11 = pattern11.matcher(challenge11);
		while(matcher11.find()) {
			System.out.println(matcher11.group(1));
		}
		
		String challenge11a = "{0, 2}, {0, 5}, {x, y}, {2, 4},";
		Pattern pattern11a = Pattern.compile("\\{(\\d+, \\d+)\\}");//NOT SURE WHY WE DON'T NEED THE ? LAZY QUANTIFIER
		Matcher matcher11a = pattern11a.matcher(challenge11a);
		while(matcher11a.find()) {
			System.out.println(matcher11a.group(1));
		}
		
		String challenge12 = "94706";
		System.out.println("Challenge 12: " + challenge12.matches("^\\d{5}$"));
		
		String challenge13 = "94706-1234";
		System.out.println("Challenge 13: " + challenge13.matches("^\\d{5}-\\d{4}$"));
		
		//MATCH EITEHR REGULAR ZIP OR LONG ZIP FORMAT USING THE SAME REGEX PATTERN
		String challenge14 = "94706-1234";		
		System.out.println("Challenge 14 Long Zip: " + challenge14.matches("^\\d{5}(-\\d{4})?$"));
		System.out.println("Challenge 14 Regular Zip: " + challenge12.matches("^\\d{5}(-\\d{4})?$"));
		//USING THE ? LAZY QUANTIFIER WILL MATCH ON ZERO OR MORE OCCURRENCES.  TRIED USING * AND IT DIDN'T WORK
		
	}
}

