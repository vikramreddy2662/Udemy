package udemy;

public class ArrayidexOutOfBound {
public static void main(String[] args) {
	method();
}
public static void method() {
	try {
	int[] arr={11,21,33};
	int number=arr[5];
	int i=50/0;
	
}
	catch(Exception e) {
		System.out.println("Array Index out of bound exception");
		System.out.println(e);
	}
		finally {
		System.out.println("ffdsfs");
	}
	

}}
