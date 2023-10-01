package udemy;

public class leapyear {
	
	    public boolean isLeapYear(int year) {
	        if(year<1){
	          return false;  
	        }
	    else if(year%4!=0 ){
	       return false;
	    }
	    else if(year%4==0 && year%100==0 && year%400!=0){
	        return false;
	    }
	         else if(year%4==0 && year%100!=0){
	        return true;
	}
	else if(year%4==0 && year%100==0 && year%400==0){
	    return true;}
		return false; 	
	}
 public static void main(String[] args) {
	 leapyear y=new leapyear();
	 System.out.println(y.isLeapYear(2100));
 }
	    }


