package udemy;

import java.util.Scanner;

public class arrayaddition {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of array");
	int n=sc.nextInt();
	int a[]=new int[n];
	int b[]=new int[n];
	System.out.println("enter first array");
    for(int i=0;i<n;i++) {
    	a[i]=sc.nextInt();
    }
	System.out.println("enter second array");
	
	for(int i=0;i<n;i++) {
		
		b[i]=sc.nextInt();		
    }
	int sum[]= new int[n];
	for(int i=0;i<n;i++) {
		if(a.length==b.length) {
			sum[i]=a[i]+b[i];
			}}
	System.out.println("result array");
	   for(int i=0;i<n;i++) {
		   System.out.println(sum[i]);
	   }
	
         }
         }
