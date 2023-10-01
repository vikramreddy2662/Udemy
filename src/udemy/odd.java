package udemy;

public class odd {
static void Odd(int i,int n) 
	{
		for( i=1;i<=n;i++) {
		if(i%2!=0) {
		System.out.println(i);
		}
		}
	}
public static void main(String[] args) {
Odd(1,100);
}
}