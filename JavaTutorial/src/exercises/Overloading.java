package exercises;

public class Overloading {

	public static void main(String[] args) {
		calcFeetAndInchesToCm(6, 0);
		calcFeetAndInchesToCm(0, 5);
		calcFeetAndInchesToCm(-10, 5);
		calcFeetAndInchesToCm(10, 15);
		calcFeetAndInchesToCm(72);
		calcFeetAndInchesToCm(100);
		calcFeetAndInchesToCm(-10);
	}
	
	
	public static double calcFeetAndInchesToCm(double feet, double inches) {
		if (feet < 0 || inches > 12 || inches < 0) {
			System.out.println("Please pass a valid number of feet and inches.");
			return -1;
		}
		else {
			double cm = (2.54 * (inches + (feet * 12)));
			System.out.println(feet + " feet " + inches + " inches = " + cm + " cm.");
			return cm;
		}
	}
	
	public static double calcFeetAndInchesToCm(double inches) {
		if (inches < 0) {
			System.out.println("Please pass a valid number of inches.");
			return -1;
		}
		else {
			double feet = (int) inches / 12;
			double remainingInches = (int) inches % 12;
			System.out.println(inches + " inches = " + feet + " feet " + remainingInches + " inches");
			return calcFeetAndInchesToCm(feet, remainingInches);
		}
	}
}
