package udemy;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	System.out.println("enter the limit");
	int limit=sc.nextInt();
	ArrayList<Integer> multiples=new ArrayList<>();
	 for(int i=1;num*i<limit;i++) {/*for(int i=1;i<limit;i++)
		                             if(i%num==0) */
		 multiples.add(num*i);
	 }
 System.out.println(multiples);
 }}
                       	 
		                             
		
			 