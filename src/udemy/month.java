package udemy;

public class month {
public  static void main(String[] args) {
	System.out.println(determineMonthName(0));}

public static String determineMonthName(int num) {
	String result="";
	switch(num) {


	case 1:result="jan";
    return result;
     
	case 2:result="Feb";
    return result;
        
	case 3:result="Mar";
    return result;
   
	case 4:result="April";
    return result;
   
	case 5:result="may";
    return result;
     
	case 6:result="june";
    return result;
     
	case 7:result="july";
    
	case 8:result="Aug";
    return result;
      
	case 9:result="sep";
    return result;
      
	case 10:result="oct";
    return result;
   
	case 11:result="Nov";
    return result;

	case 12:result="Dec";
    return result;
      }
	return result ="invalid";}}
	
	
