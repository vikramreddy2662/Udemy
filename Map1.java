package udemy;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map1 {
public static void main(String[] args) {
	String str="there are different species in a jungle.you are not eligible";
	HashMap<String,Integer> Stringoccurences=new HashMap<>();
	String words[]=str.split(" ");
	for(String word:words) {
		Integer integer=Stringoccurences.get(word);
		if(integer==null) {
			Stringoccurences.put(word,1);
		}
		else {
			Stringoccurences.put(word,integer+1);
		}}
		System.out.println(Stringoccurences);
		
	HashMap<Character,Integer> occurences=new HashMap<>();
char chars[]=str.toCharArray();
for(char character:chars) {
	Integer integer=occurences.get(character);
	if(integer==null) {
		occurences.put(character,1);
	}
	else {
		occurences.put(character,integer+1);
	}
	}

System.out.println(occurences);	

}	
}

