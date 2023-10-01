package udemy;

public class While {
	
	
static int Square( int n,int i) {
 int sum=0;

	while(i>0 && i<=n) {
		System.out.println(	i*i);
	i++;}
	return 0;
		}
static int Cube( int n,int i) {
	 int sum=0;

		while(i>0 && i<=n) {
			System.out.println(	i*i*i);
		i++;}
		return 0;
			}

public static void main(String[] args) {
	
	Square(10,1);
	Cube(20,2); 
}}
