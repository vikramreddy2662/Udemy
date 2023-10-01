package udemy;

public class SumOfSquares {
static  long calculateSumOfSquares( int i,int n) {
	if(n<=0) {
		return -1;
	}
	else {
	int sum=0;
	for( i=1;i<=n;i++) {
		sum=sum+i*i;
	}
return sum;
	
}}
public static void main(String[] args) {
	SumOfSquares s=new SumOfSquares();
	System.out.println(s.calculateSumOfSquares(1,30));
}
}
