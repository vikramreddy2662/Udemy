package udemy;

public class WEEKDAY {
	public static void main(String[] args) {
  String s[]= {"MONDAY" ,"TUESDAY" ,"WEDNESDAY" ,"THURSDAY" ,"FRIDAY" ,"SATURDAY" ,"SUNDAY"};
  String longestword="";
	int maxlength=0;
		for(int i=0;i<s.length;i++) {
			if(s[i].length()>maxlength) {
				maxlength=s[i].length();
				longestword=s[i];
			}
			}
		System.out.println(longestword);
          for(int i=s.length-1;i>=0;i--) {		
        	  System.out.println(s[i]);
		}}}
