package udemy;

public class Stringfunction {
public static void main(String[] args) {
   	int i;int count=0;
	String str="SArabula VI1Kram red2dY";
	for(i=0;i<str.length();i++) {
		if(Character.isUpperCase(str.charAt(i))){
			count++;
			
	System.out.println(count);}}
	for(int j=str.length()-1;j>=0;j--) {
		if(Character.isDigit(str.charAt(j))) {
	     char c=str.charAt(j );
	     System.out.println(Character.getNumericValue(c));}
	}}}







