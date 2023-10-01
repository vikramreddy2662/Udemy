package udemy;

public class angles {
public static int thirdAngle(int a1,int a2) {
	int c=180-(a1+a2);
	return c;
}
public static void main(String[] args) {
	angles a=new angles();
	System.out.println(a.thirdAngle(34,56));
}}


