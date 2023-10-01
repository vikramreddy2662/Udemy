package udemy;

public class multiplicationtable {
	
static void tablee(int i,int n,int table){
	
	for(i=1;i<=n;i++) {
		System.out.printf("%d * %d = %d",table,i,table * i).println();}
}

public static void main(String[] args) {
	tablee(1,20,7);}
}
