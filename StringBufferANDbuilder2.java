package udemy;

import java.util.Scanner;

public class StringBufferANDbuilder2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the String");
	String str=sc.nextLine();
	String[] words=str.split(" ");
	StringBuffer reverseSentence=new StringBuffer();
	for(String word:words) {
	StringBuffer reverseWord=new StringBuffer(word);	
	reverseWord.reverse();
	reverseSentence.append(reverseWord +" ");
	}
	
}
}
/*String Buffer and String Builder both are predefined classes performs same operations but String Buffer can be accessed by only one
thread at a time and are used for immutable String operations*/
