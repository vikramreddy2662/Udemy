package udemy;
public class TimeConverter {
    public static int convertHoursToMinutes(int hours) {
        // Your task: complete this method
    if(hours<0){
        return -1;
    }
    else{
    	int minutes=hours*60;
        return minutes;
    }
   
    }
    public static int convertDaysToMinutes(int days){
        
        if(days<0){
            return -1;
        }
        else{
        	int minutes=days*24*60;
            return minutes;
        }
    };
    public static void main(String[] args){
        TimeConverter T=new TimeConverter();
      System.out.println(T.convertHoursToMinutes(22));
      System.out.println(T.convertDaysToMinutes(5));
    }
    
   
}