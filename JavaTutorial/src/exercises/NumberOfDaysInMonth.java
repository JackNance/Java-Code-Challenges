package exercises;

public class NumberOfDaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
   
	    public static boolean isLeapYear(int year){
	        if((year > 0 && year <= 9999) && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)){
	            return true;
	        }
	        else{
	            return false;
	        }
	    }
	    
	    public static int getDaysInMonth(int month, int year){
	        switch(month){
	            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	                return 31;	                
	            case 2:
	                boolean leapYear = isLeapYear(year);
	                if(leapYear) {
	                    return 29;	
	                }
	                else{
	                    return 28;
	                 }	                
	            case 4: case 6: case 9: case 11:
	                return 30;	                
	            default:
	                return -1;
	                
	        }
	    
	    }
}
