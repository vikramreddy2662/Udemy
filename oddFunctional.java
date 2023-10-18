package udemy;

import java.util.List;

public class oddFunctional {
public static void main(String[] args) {
	List<Integer> list=List.of(12,21,34,56,97);
	
generalprint(list);
filterPrint(list);
generalPrint1(list);
filterPrint1(list);
}



public static void generalprint(List<Integer> list) {
	for(int i:list) {
	 
	System.out.println(i);
}}
public static void filterPrint(List<Integer> list) {
	int sum=0;
	for(int i:list) {
		sum=sum+i;
		}
	System.out.println(sum);
}
public static void generalPrint1(List<Integer> list) {
	list.stream().forEach(element->System.out.println(element));/*we can perform many operations on streams,stream->stream of
numbers or integers etc*/
}
public static void filterPrint1(List<Integer> list) {
	int sum=list.stream()
	.filter(element->element%2!=0)
	.reduce(0,(element1,element2)->element1+element2);/*lamda expressions are used to performs operations with clear and precise steps*/
    System.out.println(sum);
	}}

