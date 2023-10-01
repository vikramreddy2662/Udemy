package udemy;

public class point {
private int x;
private int y;

public  point(int x,int y ) {
	this.x=x;
	this.y=y;
}
public int getX() {
	return x;
}
public int getY() {
	return y;
}
public  void move(int dx,int dy) {
this.x+=dx;
this.y+=dy;
}
public double distanceTo(point other) {
double distance=Math.sqrt((other.x-this.x)^2+(other.y-this.y)^2);
return distance;}
public static void main(String[] args) {
point p1=new point(3,4);
point p2=new point(6,8);
p1.move(1,1);
System.out.println(p1.getX()+","+p1.getY());
System.out.println(p1.distanceTo(p2));
}}


