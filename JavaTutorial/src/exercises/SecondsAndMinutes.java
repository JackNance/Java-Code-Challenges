package exercises;

public class SecondsAndMinutes {

		public static void main(String[] args) {
			System.out.println(getDurationString(158, 7));
			System.out.println(getDurationString(-15, 7));
			System.out.println(getDurationString(158, 67));
			System.out.println(getDurationString(158, -10));
			System.out.println(getDurationString(10087));
		}
		
		public static String getDurationString(int minutes, int seconds) {
			if(minutes < 0 || seconds < 0 || seconds > 59) {
				return "Invalid value";
			}
			else {
				int hours = minutes / 60;
				int remainingMinutes = minutes % 60;
				return (hours + "h " + remainingMinutes + "m " + seconds + "s");
			}
			
		}
		
		public static String getDurationString(int seconds) {
			if( seconds < 0 ) {
				return "Invalid value";
			}
			else {
				int minutes = seconds / 60;
				int remainingSeconds = seconds % 60;
				return getDurationString(minutes, remainingSeconds);
			}
			
		}
}
