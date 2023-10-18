package udemy;

import java.util.List;

public class functionalprogramming<list>{
public static void main(String[] args) {
	List<String> list=List.of("apple","banana","orange","papaya");
	PrintBasic(list);
	filtering1(list);
	PrintBasic1(list);
	filtering2(list);
	}
	
   private static void PrintBasic(List<String> list) {
	   for(String string:list) {
		  
		   System.out.println(string);
    	}															
    }
   public static void filtering1(List<String> list) {
	   for(String string:list) {
		   if(string.endsWith("a")) {
		   System.out.println(string);
    	}														
    }}
   public static void PrintBasic1(List<String> list) {
	   list.stream().forEach(element-> System.out.println(element)); 
   }
   public static void filtering2(List<String> list) {
	   list.stream()
	   .filter(element->element.endsWith("a"))
	    .forEach(element->System.out.println(element));
   }
   
   
}

