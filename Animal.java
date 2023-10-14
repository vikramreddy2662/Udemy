package udemy;
abstract class specie{
	abstract void bark();
}
class cat extends specie{
public void bark() {
System.out.println("meow meow");
			}
}
class Dog extends specie{
	public void bark() {
	System.out.println("bow bow");	
}}
 public class Animal {
public static void main(String[] agrs) {
specie[] species= {new cat(),new Dog()};
for(specie specie:species)
specie.bark();
}
}
