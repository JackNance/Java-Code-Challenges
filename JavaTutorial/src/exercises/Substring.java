package exercises;

public class Substring {

	public static boolean isStringASubstringofB(char[] stringA, char[] stringB) {
		
		if(stringB.length == 0) {
			return false;
		}
		else if (stringB.length < stringA.length){			
			return false;
		}
		else {				
			for(int i = 0; i < stringB.length - stringA.length + 1; i++) {
				for(int j = 0; j < stringA.length; j++) {
					if(stringA[j] != stringB[j+i]) {
						break;
					}
					else if(j == stringA.length -1 && stringA[j] == stringB[j+i]) {
						return true;
					}
				}
			}
						
		}
		
		return false;
	}

	public static void main(String[] args) {
		
		System.out.println(isStringASubstringofB("123456".toCharArray(), "12345".toCharArray()));
		System.out.println(isStringASubstringofB("12345".toCharArray(), "12345".toCharArray()));
		System.out.println(isStringASubstringofB("12347".toCharArray(), "12346".toCharArray()));
		System.out.println(isStringASubstringofB("1234".toCharArray(), "1243".toCharArray()));
		System.out.println(isStringASubstringofB("This should".toCharArray(), "This should work".toCharArray()));
		System.out.println(isStringASubstringofB("This Should".toCharArray(), "This should work".toCharArray()));
		System.out.println(isStringASubstringofB("This Should".toCharArray(), "I really think that This Should".toCharArray()));
	}

}
