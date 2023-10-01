package udemy;

public class Alpha {
private char mychar;

public Alpha(char mychar) {
	this.mychar=mychar;
}
 public boolean isVowel() {
    
	 if(mychar=='a' || mychar=='A'||mychar =='e' || mychar=='E' || mychar =='i' ||  mychar=='I' || mychar =='o' || mychar=='O'|| mychar =='u' || mychar=='U' ) {
	return true;	
	 }
	 return false;
 }
 public boolean isConsonant() {
	 if(mychar!='a' || mychar!='A'||mychar !='e' || mychar!='E' || mychar !='i' ||  mychar!='I' || mychar !='o' || mychar!='O'|| mychar !='u' || mychar!='U' ) {
			return true;	
			 }
			 return false; 
 }
	 
	  public boolean isDigit() {
	
	 if(mychar>=48 && mychar<=57) {
		 return true;
	 }
	 return false;
 }
 
 public boolean isUpperCase() {
	
	 if(mychar>=65 && mychar<=91) {
		 return true;
	 }
	 return false;
}
 public boolean isLowerCase() {
	
	 if(mychar>=97 && mychar<=123) {
		 return true;
	 }
	 return false; 
 }
 public static void main(String[] args) {
	 Alpha a=new Alpha('A');
	 System.out.println(a.isVowel());
	 System.out.println(a.isConsonant());
	 System.out.println(a.isDigit());
	 System.out.println(a.isUpperCase());
	 System.out.println(a.isLowerCase());
	 
 }
 
 
}
