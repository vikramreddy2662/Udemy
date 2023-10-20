/*Runnable interface is also implemented  to use threads but in runnable intertface thread methods and 
and their reference objects neeed to be created seperately*/
package udemy;
class A implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
class B implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
public class RunnableInterfsce {
public static void main(String[] args) {
A obj1=new A();
B obj2=new B();
Thread t1=new Thread(obj1);
Thread t2=new Thread(obj2);
t1.start();
t2.start();
}
}
