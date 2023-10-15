package udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class arrayssort {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("enter the String1");
    String str1=sc.nextLine();
    System.out.println("enter the String2");
    String str2=sc.nextLine();

  
    if(str1==null || str2==null) {
    	System.out.println(false);
    }
    else if(str1.length()!=str2.length()) {
    	System.out.println(false);}
    
    char[] chars1=str1.toCharArray();
    char[] chars2=str2.toCharArray();
     Arrays.sort(chars1);
     Arrays.sort(chars2);
     if(Arrays.equals(chars1, chars2)) {
    	 System.out.println("both the strings  are equal"); 
     }
     else {
     System.out.println("both the strings  are  not equal");
     }
   }}
