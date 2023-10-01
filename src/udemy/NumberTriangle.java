package udemy;

public class NumberTriangle {

	static void triangle(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j);}
		
	System.out.println();
	}}
	public static void main(String[] args) {
		NumberTriangle t=new NumberTriangle();
		t.triangle(25);
	}
}
