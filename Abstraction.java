package udemy;

abstract class car23{
	public abstract void drive();
	public void name() {
		System.out.println("name is lamborgini");
	}
}
class car2 extends car23{
	public void drive() {
		System.out.println("drives at higher speed");
	}
	public void color() {
		System.out.println("most of lamborginis are in red color");
	}
}
public class Abstraction {
public static void main(String[] args) {
	car2 c=new car2();
	c.drive();
	c.name();
}
}
