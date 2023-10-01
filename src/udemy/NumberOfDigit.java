package udemy;

public class NumberOfDigit {
 static int digits(int n)
 {
	 int i=0;
if(n<0) {
return -1;
} 
else if(n==0) {
	return 1;
}
else
	while(n>0) {
		
		n=n/10;
		i++;
	}
return i;}
public static void main(String [] args) {
 NumberOfDigit d=new  NumberOfDigit();
System.out.println(d.digits(4));		
}}

