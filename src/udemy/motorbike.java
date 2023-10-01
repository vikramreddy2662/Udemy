package udemy;

public class motorbike {
private int speed;

public int getSpeed() {
	return speed;
	
}
public void setSpeed(int speed)
{
	this.speed=speed;
	
}
static void start() {
	System.out.println("bike is started");
}
public void increaseSpeed(int howmuch) {
	setSpeed(this.speed+howmuch);
}

public static void main(String[] args) {
	motorbike honda=new motorbike();
	motorbike enfield=new motorbike();
	honda.setSpeed(100);
	
	honda.increaseSpeed(100);
	enfield.increaseSpeed(50);
	
	System.out.println(honda.getSpeed());
	System.out.println(enfield.getSpeed());
	honda.start();
	enfield.start();
}
}
