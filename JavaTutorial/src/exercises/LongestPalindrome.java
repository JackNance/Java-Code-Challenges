package exercises;

public class LongestPalindrome {

	public static void main(String[] args) {
		String s1 = "amanaplanacanalpanamarobertreedreddercheddareeeeeeee";
		String s2 = "boxobghenedheamanaplanacanalpanamaghghththelllek";
		String s3 = "box";
		String s4 = "eeee";
		
		printLongestPalindrome(s1);
		printLongestPalindrome(s2);
		printLongestPalindrome(s3);
		printLongestPalindrome(s4);
	}

		public static void printLongestPalindrome(String S)
		{
		    int maxBack=-1;
		    int maxFront = -1;
		    int maxLength=0;
		    for (int potentialCenter = 0 ; potentialCenter < S.length();potentialCenter ++ )
		    {   
		        int back = potentialCenter-1;
		        int front = potentialCenter + 1;
		        int longestPalindrome = 0;
		        while(back >=0 && front<S.length() && S.charAt(back)==S.charAt(front))
		        {
		            back--;
		            front++;
		            longestPalindrome++;

		        }
		        if (longestPalindrome > maxLength)
		        {
		            maxLength = longestPalindrome+1;
		            maxBack = back + 1;
		            maxFront = front;
		        }
		        back = potentialCenter;
		        front = potentialCenter + 1;
		        longestPalindrome=0;
		        while(back >=0 && front<S.length() && S.charAt(back)==S.charAt(front))
		        {
		            back--;
		            front++;
		            longestPalindrome++;
		        }
		        if (longestPalindrome > maxLength)
		        {
		            maxLength = longestPalindrome;
		            maxBack = back + 1;
		            maxFront = front;
		        }

		    }


		    if (maxLength == 0) System.out.println("There is no Palindrome in the given String");
		    else{
		        System.out.println("The Longest Palindrome is " + S.substring(maxBack,maxFront) + " of " + 
		        		(maxLength % 2 == 0 ? maxLength*2 : maxLength*2 -1) );
		    }
		}
	
}
