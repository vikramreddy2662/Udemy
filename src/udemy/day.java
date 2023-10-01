package udemy;

public class day {
public static void main(String[] args) {
	System.out.println(determineDayName(2));
	System.out.println(weekDayorNot(1));
}
public static boolean weekDayorNot(int num) {
	
	switch(num) {
	case 1: return true;
	case 2: return false;
	case 3: return false;
	case 4: return false;
	case 5: return false;
	case 6: return false;
	case 7: return true;
	}
	return false;
}



	public static String determineDayName(int num) {
		
	switch (num) {
	case 1:
		 return "sunday";
	           
	case 2:
		   return "monday";
	            
	case 3:
		   return "tuesday";
	           
	case 4:
		   return "wednesday";
	             
	case 5:
		   return "thursday";
	             
	case 6:
		   return "friday";
	              
	case 7:
		   return "saturday";
	              }
	return "invalid";
	
	
	
	}
	}
	
