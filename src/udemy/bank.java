package udemy;

public class bank {
String name;
int age;
String password;
  public String getName()
  {
	  return name;
  }
  public void setName(String n) {
	  name=n;
  }
  public int getAge() {
	  return age;
  }
  public void setAge(int a) {
	  age=a;
  }
public String getPassword() {
return password;
}
public void setPassword(String pass) {
password=pass;
}
public static void main(String[] args) {
bank b=new bank();
b.setName("vikram reddy");
b.setAge(22);
b.setPassword("Vikram@2662");
System.out.println(b.getName()+" , "+b.getAge());
System.out.println(b.getPassword());
}
}






