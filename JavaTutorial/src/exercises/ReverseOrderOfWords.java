package exercises;

public class ReverseOrderOfWords {
	
	public static void main(String[] args) {
		String input = "This is a test string";
		String output = reverse(input);
		System.out.println(output);
	}
	
	public static String reverse(String input) {
		String reverse = "";
		if (input.isEmpty() || input == null) {
			System.out.println("Empty and null strings are not accepted");
		} else {
			String[] originalArray = input.split("\\s+");
			
			for (String item : originalArray) {
				reverse = item + " " + reverse;
			}
		}
		return reverse;
	}

}
