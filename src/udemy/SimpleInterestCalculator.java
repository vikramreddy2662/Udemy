package udemy;

public class SimpleInterestCalculator {
double principal;
double interest;

SimpleInterestCalculator(double principal,double interest){
this.principal=principal;
this.interest =interest;
}
public double TotalValue(double years) {
double total=principal+((principal*interest*years)/100)*12;
return total;
}
public static void main(String[] args) {
	SimpleInterestCalculator c=new SimpleInterestCalculator(4.5,10);
	double k=c.TotalValue(1);
	System.out.println(k);
	
}
}
