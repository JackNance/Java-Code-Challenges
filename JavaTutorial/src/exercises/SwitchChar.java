package exercises;

public class SwitchChar {

	public static void main(String[] args) {
		checkChar('A');
		checkChar('a');
		checkChar('B');
		checkChar('C');
		checkChar('D');
		checkChar('5');	
		checkChar('E');	
	}

	public static void checkChar(char c) {
		switch(Character.toUpperCase(c)) {
		case 'A': case 'B': case 'C': case 'D': case 'E':
			System.out.println(c  + " was found");
			break;		
//		case 'B':
//			System.out.println(c  + " was found");
//			break;
//		case'C':
//			System.out.println(c+" was found");
//			break;
//		case'D':
//			System.out.println(c+" was found");
//			break;
		default:
			System.out.println(c + " was not found");
		}
	}

}
