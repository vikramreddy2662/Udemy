package udemy;

public class Square {
private int side;

Square(int side){
	this.side=side;
}
public  int Area(int side) {
	if(this.side<=0) {
		return -1;
	}
	return side*side;
}
public  int Perimeter(int side) {
	if(this.side<=0) {
		return -1;
	}
	return 4*side;
}
public static void main(String[] args) {
	Square s=new Square(65);
	System.out.println(s.Area(9));
	System.out.println(	s.Perimeter(19));
}
}
