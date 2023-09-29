package udemy;

public class StringDuplicates{
	String str;
	static boolean hasDuplicates(String str) {
		if(str==null)
			
		return false;
		
		if(str.length()==1)
		{
			return false;
		}
		for(int i=0;i<str.length()-1;i++)
	{
       for(int j=0;j<str.length();j++) {
    	   
       }
			
		if(str.charAt(i)==str.charAt(i+1)) {
			return true;
		}
		}
		return false;}
	
	public static void main(String[] args) {
		System.out.println(hasDuplicates("well come"));
	}
	}
