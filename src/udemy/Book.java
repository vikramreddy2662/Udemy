package udemy;

public class Book {

double price;
int noOfCopies;
 static void read() {
	 System.out.println("I CAN READ THIS BOOK");
 }
 public static void main(String[] args) {
	 Book mahabharatha=new Book();
	 Book monk=new Book();
mahabharatha.price=2000d;
mahabharatha.noOfCopies=25;
monk.price=500d;
monk.noOfCopies=45;
System.out.println(mahabharatha.price+","+mahabharatha.noOfCopies+","+monk.price+","+monk.noOfCopies);
mahabharatha.read();
 monk.read();
 }
}
