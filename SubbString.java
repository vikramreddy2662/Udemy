package udemy;
import java.util.Scanner;

public class SubbString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String str = sc.nextLine();
          
        if(str==null) {
        	System.out.println("");
        }
        if(str=="") {
        	System.out.println("");
        }
        
        else {
        String words[] = str.split(" ");
        String longestWord = "";
        int maxLength = 0;

        
        for (String word : words) {
        	System.out.println(word);
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }

        System.out.println(longestWord);}

        
        
    }
}