package udemy;

public class StringBufferAndBuilder {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("hello world");
	System.out.println(sb.replace(0,5,"vikram"));
	System.out.println(sb.append(" "+ "migthty world"));
	System.out.println(sb.substring(2,6));
	System.out.println(sb.indexOf("w"));
	System.out.println(sb.delete(0,6));

}
}
