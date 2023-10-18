package udemy;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class snow implements Evenfilter<Integer>{
	public int even(int num) {
		return num%2;
	}
}



public class streamTerminal {
public static void main(String[] args ) {
	List<Integer> list=List.of(21,44,32,56,35,66);
   collector(list);
   Even(list);
   FirstFive(list);
  }
	public static void collector(List<Integer> list) {
		list.stream()
		.filter(e->e%2==1)
		.collect(Collectors.toList())
		.forEach(e->System.out.println(e));
	}
	public static void Even(List<Integer> list) {
     IntStream.range(1, 50)
     .filter(new snow())
     .forEach(e->System.out.println(e));
	}
	public static void FirstFive(List<Integer> list) {
		IntStream.range(1, 10)
		.map(e->e*e).boxed().collect(Collectors.toList())
		.forEach(e->System.out.println(e));
	}
		
}

