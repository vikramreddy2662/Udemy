package udemy;
class A1{
	A1(){
		
		System.out.println("ffff");	
	}
	A1(int n){
		n=9;
		System.out.println(n);		
	}
	
	public void print() {
		System.out.println("he is genius");
	}}
	
class b21 extends A1{
	
	b21(int n) {
      super(n);
		System.out.println(n);
	}

	public void show() {
	System.out.println("geethajali college of enginnering");
	}
}



 public class SUPER {
public static void main(String[] args) {
	b21 obj=new b21(5);
	obj.show();
	obj.print();
	
}

}
