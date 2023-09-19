package udemy;

public class triangle {
static boolean validTriangle(int angle1,int angle2,int angle3) {
	if(angle1<=0 || angle2<=0 || angle3<=0){
	return false;
	}
	int sum=angle1+angle2+angle3;
if(sum==180) {
	return true;
}
return false;
}
public static void main(String[] args) {
	triangle T=new triangle();
	System.out.println(validTriangle(30,60,40));
}
}
