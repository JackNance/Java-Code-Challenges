package exercises;

import java.util.regex.*;

public class PasswordStrength {

	public static void main(String args[]) {
		System.out.println(minimumNumber("abc"));
		System.out.println(minimumNumber("tRBB%1245"));
	}
	
	// minimumNumber of digits needed to make a password a strong password at least 6 characters long
    public static int minimumNumber(String s) {
        int count = 0;
		
		Pattern patternDigit = Pattern.compile("(\\d)");
		Pattern patternUpper = Pattern.compile("([A-Z])");
		Pattern patternLower = Pattern.compile("([a-z])");
		Pattern patternSpecial = Pattern.compile("(\\W)");
        
		Matcher matcherDigit = patternDigit.matcher(s);
		Matcher matcherUpper = patternUpper.matcher(s);
		Matcher matcherLower = patternLower.matcher(s);
		Matcher matcherSpecial = patternSpecial.matcher(s);
		
		if (!matcherDigit.find()) {
			count++;
		}
		if (!matcherUpper.find()) {
			count++;
		}
		if (!matcherLower.find()) {
			count++;
		}
		if (!matcherSpecial.find()) {
			count++;
		}
		if ((count + s.length())<6) {
			count = count + 6-(count+s.length());
		}
		return count;
	}

}
