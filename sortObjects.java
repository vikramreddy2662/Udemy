package udemy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student1 implements Comparable<Student1>{
	private String name;
	private int id;
	
public Student1(int id, String name) {
	this.id=id;
	this.name=name;
	}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public void setId(int id) {
	this.name=name;
}
public void setName(String name) {
	this.name=name;
}
public String toString() {
	return id+ ""+name;
}

@Override
public int compareTo(Student1 that) {
	
	return Integer.compare(this.id,that .id);
}

}
public class sortObjects {
public static void main(String[] args) {
	List<Student1> stdt=List.of(new Student1(122," vikram "),new Student1(21," agent "),new Student1(89," peter "));
    List<Student1> students=new ArrayList<Student1>(stdt);
    System.out.println(students);
    Collections.sort(students);
    System.out.println(students);
}
}
