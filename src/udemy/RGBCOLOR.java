package udemy;

public class RGBCOLOR {
private int red;
private int green;
private int blue;
RGBCOLOR(int red,int green,int blue){
	this.red=red;
	this.green=green;
	this.blue=blue;
}

public  void invert() {
	this.red=255-this.red;
	this.green=255-this.green;
	this.blue=255-this.blue;
}
public int getRed() {
	return red;
}
public int getGreen() {
	return green;
}
public int getBlue() {
	return blue;
}
public static void main(String[] args) {
	RGBCOLOR r=new RGBCOLOR(123,233,213);
	r.invert();
	System.out.println(r.getRed()+","+r.getGreen()+","+r.getBlue());
}
}
