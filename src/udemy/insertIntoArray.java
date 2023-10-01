package udemy;

public class insertIntoArray {
public static void main(String[] args) {
	int a[]= {11,21,43,21,22};
	int indextoadd=3;
	int value=99;
    
	int newArray[]=new int[a.length+1];
	
	for(int i=0;i<newArray.length;i++) {
		if(i==indextoadd) {
			newArray[i]=value;}
		else {
			for(int j=0;i<a.length;j++) {
			newArray[i]=a[j];
		    }}}
	
	for(int i=0;i<newArray.length;i++) {
	System.out.println(newArray[i]);
	}}}
	


