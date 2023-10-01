package udemy;

public class MULTI {
void print(int i,int n,int table) {
	for(i=1;i<=n;i++) {
	System.out.printf("%d * %d = %d",table,i,table * i ).println();
}}
public static void main(String[] args) {
	MULTI m=new MULTI();
	m.print(1,20,6);
}
}
