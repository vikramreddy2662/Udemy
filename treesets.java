package udemy;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
class  length implements Comparator<String>{


	public int compare(String s1,String s2 ) {
		
		return Integer.compare(s1.length(),s2.length());
	}

}
public class treesets {
public static void main(String[] args) {
	TreeSet<String> fruits=new TreeSet<String>(new length());
	fruits.addAll(Set.of("apple","banana","orange","mango"));
	System.out.println(fruits);
	
	
}
}
