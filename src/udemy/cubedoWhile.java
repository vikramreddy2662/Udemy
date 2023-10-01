package udemy;

import java.util.Scanner;

public class cubedoWhile {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the cube limit");
	int n=sc.nextInt();
	

	int i=1;int sum=0;
	do {
		System.out.println(i*i*i);
	     i++; 
	     
	}while(i<=n);
	
	
}
}

