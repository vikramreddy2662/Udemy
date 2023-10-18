package udemy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamOperations {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter  array");
	for(int i=0;i<n;i++) {
	 a[i]=sc.nextInt();}
	ArrayList<Integer> list=new ArrayList();
	for(int i=0;i<n;i++) {
	list.add(a[i]);}
	streams(list);
	max(list);}
     public static void streams(List<Integer> list) {
    	list.stream().distinct().sorted()
    	.forEach(e->System.out.println(e));
    	list.stream()
    	.map(e->e*e)	
    	.forEach(e->System.out.println(e));
    	 }
     
     public static void max(List<Integer> list) {
    	int max= list.stream().max((n1,n2)->Integer.compare(n1,n2)).get();
    	 System.out.println(max);
}}

