package udemy;

import java.util.Scanner;
import java.math.*;
public class LCM {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first number");
	int number1=sc.nextInt();
	System.out.println("enter the second number");
	int number2 =sc.nextInt();
	
	static int lcmOfnum(int number1,int number2) {
	if(number1<0 || number2<0) 
		return -1;
	 if(number1==0||number2==0)
			return 0;
	 if(number1==number2)
		return  number1;
	
	int max=Math.max(number1, number2);
		int k=max;
		while(true) {
	if(max%number1==0 && max%number2==0)
		return k;
	else
		return k+=max;}
	
}}
