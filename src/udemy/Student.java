package udemy;

public class Student {
String name;
int length;
static int arr[];
Student(String name,int...arr)
{
	this.arr=arr;
	this.name=name;
	this.length=length;
}

static int getNumberOfMarks(int arr[],int length)
{
	 int size=arr.length;
	return size;
}

static int getMarks(int arr[],int length)
{
	length=arr.length;
    for(int i=0;i<length;i++) {
    	return arr[i];
	
	}
    return 0;
    
}
static int sum(int arr[],int length)
{
	int sum=0;
	for(int i=0;i<length;i++) {
	sum=sum+arr[i];
	}
	return sum;
}
static int min(int arr[],int length) {
	int min=0;
	for(int i=0;i<length;i++) {
     if(arr[i]<arr[min]) {
    	min=arr[i] ;    
     }}
	return min;}
static int max(int arr[],int length) {
	int max=0;
	for(int i=0;i<length;i++) {
     if(arr[i]>arr[max]) {
    	max=arr[i] ;    
     }}
	return max;}
static double average(int arr[],int length) {
	int sum=0;
	for(int i:arr) {
	sum=sum+arr[i];}
	int average=sum/length;
	
	return average;
}
public static void main(String[] args) {
   
	Student s=new Student("vikram",22,12,32,45,67);
	int size = s.getNumberOfMarks(arr,5);
	System.out.println(size);
	int marks=s.getMarks(arr, 5);
	System.out.println(marks);
	int sum=s.sum(arr,5);
	System.out.println(sum);
	int min=s.min(arr,5);
	System.out.println(min);
	int max=s.max(arr,5);
	System.out.println(max);
	double average=s.average(arr,5);
	System.out.println(average);
	
	
	
}

}

