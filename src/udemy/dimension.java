package udemy;

public class dimension {
private int inches;
private int feets;

dimension(int inches){
	if(inches<0) {
		this.feets=-1;
		this.inches=-1;}
	
	else
		this.feets=inches/12;
	    this.inches=inches%12;}
	
	
	
	
public int getFeet() {
	
		return feets;
}
public int getInches(){
	
		return inches;}
	

	public static void main(String[] args) {
		dimension d=new dimension(2345);
		System.out.println(d.getFeet());
	    System.out.println(d.getInches());
	}
}






