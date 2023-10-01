package udemy;

public class primeAndSum {
	 int num;
	 
	

	public static void Prime(int num) {
		
		for( int i=2;i<num;i++) {
		if(num%i==0) {
			System.out.println("not a prime");
		}
		
		System.out.println("it's a prime");
		}}
	public static void  divisorSum(int num) {
		
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				sum+=i;}
				System.out.println(sum);
		if(num%i!=0){
		
		System.out.println("no divisors");}}}
		
	
	public static void main(String [] args){
		primeAndSum ps=new primeAndSum();
		ps.Prime(5);
		ps.divisorSum(8);
	
	}}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	

