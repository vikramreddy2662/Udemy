package udemy;

class flower
{
	public void type() {
		System.out.println("there are different types");
	}
}
class flower1 extends flower{
	public void color() {
		System.out.println("the color is red");
	}
}
class flower2 extends flower1{
public void price() {
	 System.out.println("price ranges between 100-200");
}
}

public class multiLevel {
public static void main(String[] args) {
	flower2 f=new flower2();
	f.color();
	f.type();
	f.price();
}
}
