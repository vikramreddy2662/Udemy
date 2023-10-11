package udemy;

class vehicle1{
String name;
int speed;
public String wheeler() {
	return "honda";
}}
class car extends vehicle1{
public int speedd() {
	return 150;
}}
class lorry extends vehicle1{
	public void show() {
		 System.out.println("TATA HISTA");
	}
}
public class hierarchical {
public static void main(String[] args) {
lorry L=new lorry();
car c=new car();
L.show();
System.out.println(c.speedd());
System.out.println(L.wheeler());
System.out.println(c.wheeler());
}
}
