import java.util.Scanner;

public class Onsesaon  {
	
	 double checkDiscount( double price){
		double discount=price*15/100;
		return discount;
		
	}
	 double checkDiscount(double price, double discount) {
		double disc=price+discount/100;
		return disc;
		
	 }
	 public double totalAmount, discount;
	 void totalAmount() {
Scanner in=new Scanner(System.in);
	System.out.println("Enter the amount" );
	
	
	 totalAmount = in.nextDouble();
			 
			 System.out.println("enter discount ");
			 discount=in.nextDouble();
			 double discountAmt= checkDiscount(totalAmount);
			 System.out.println("Discounted price: " +discountAmt);
			 double totalPrice=totalAmount-discountAmt;
			 System.out.println("Total Amount: " +totalPrice);
}
	 
public static void main(String[] args){
	Onsesaon obj1=new Onsesaon();
	obj1.totalAmount();
}
}
