package exercises;

public class StringFirstNonRepeating {

	static final int NO_OF_CHARS = 256;
	static char charCounts[] = new char[NO_OF_CHARS];

	public static void main(String[] args) {
		String str = "geeks4geeks";
		int index = firstNonRepeating(str);

		System.out.println(index == -1 ? "Either all characters are repeating or string is empty"
				: "First non-repeating character is " + str.charAt(index));
	}

	//GET COUNT FOR EACH CHAR IN STRING
	static void getCharCountArray(String str) {
		for (int i = 0; i < str.length(); i++) {
			charCounts[str.charAt(i)]++;
		}		
	}

	//RETURN INDEX OF 1ST NON REPEATING CHAR, ELSE RETURN -1
	static int firstNonRepeating(String str) {
		getCharCountArray(str);
		int index = -1;

		for (int i = 0; i < str.length(); i++) {
			if (charCounts[str.charAt(i)] == 1) {
				index = i;
				break;
			}
		}

		return index;
	}

}
