package udemy;

public class person {
String name;
int age;
String gender;
String address;
static void walk() {
	System.out.println("a human  can walk");
}
static void think() {
	System.out.println("thinking...");
}
public static void main(String[] args) {
	person p=new person();
	p.name="vikram";
	p.age=22;
	p.gender="male";
	p.address="karimnagar";
System.out.println(p.name+","+p.age+","+p.gender);
System.out.println(p.address);
p.walk();
p.think();
}



}
