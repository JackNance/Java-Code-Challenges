package exercises;

public class DigitSumChallenge {

	public static void main(String[] args) {
		System.out.println(sumDigits(357));
		System.out.println(hasSameLastDigit(234, 435, 38));
	}
	
	public static int sumDigits(int num) {
		if(num < 10) {
			return -1;
		}
		else {
			int sum = 0;
			int lastDigit = 0;
			while(num != 0) {
				lastDigit = num % 10;
				sum += lastDigit;
				num /= 10;
			}
			return sum;
		}
	}
	
	public static boolean hasSameLastDigit(int x, int y, int z){
        if (x < 10 || y < 10 || z < 10 || x > 1000 || y > 1000 || z > 1000){
            return false;
        }
        int xLastDigit = x % 10;
        int yLastDigit = y % 10;
        int zLastDigit = z % 10;
        
        return ((xLastDigit == yLastDigit) || (yLastDigit == zLastDigit) || (xLastDigit == zLastDigit));
    }
}
