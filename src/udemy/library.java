package udemy;

public class library {

private String Bookname;
private int NoOfCopies;

public String getBookName() {
	
	return Bookname;
}

public int getNoOfCopies() {

	return NoOfCopies;
}
public void setBookName(String name) {
	Bookname=name;
}
public void setNoOfCopies(int copies){
	NoOfCopies=copies;
	
}
public void increase(int howmuch) {
	setNoOfCopies(NoOfCopies+howmuch);
}
public void decrease(int howmuch) {
	setNoOfCopies(NoOfCopies-howmuch);
}

public static void main(String[] args) {
	library l=new library();
	l.setBookName("THINK LIKE A MONK");
	l.setNoOfCopies(22);
	l.increase(55);
	l.decrease(12);
	System.out.println(l.getBookName());
	System.out.println(l.getNoOfCopies());
}
}
