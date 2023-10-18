package udemy;

import java.util.ArrayList;
import java.util.List;

class gen{
	
public void addElement(String element)
{
	ArrayList<String> list1=new ArrayList<String>();
	
	list1.add(element);
	
}
public void addInteger(int number) {
	ArrayList<Integer> list2=new ArrayList<>();
	list2.add(number);
}



}
public class Generics {
public static void main(String[] args) {
gen g=new gen();
ArrayList<String> list1=new ArrayList<>();
list1.addAll(List.of("Vikram Reddy Sarabudla"));

System.out.println(list1);
ArrayList<Integer> list2=new ArrayList<>();
list2.addAll(List.of(22,33,12));
System.out.println(list2);

}
}
