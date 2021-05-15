import java.util.Scanner;


public class OffSeason extends Onsesaon  {
	double totalAmount;
	
@Override
	 void totalAmount() {
	Scanner in=new Scanner(System.in);
		System.out.println("Enter the amount" );
		
		 totalAmount = in.nextDouble();
				 
				 double discountAmt=checkDiscount(totalAmount);
				 System.out.println("Discounted price: " +discountAmt);
				 double totalPrice=totalAmount-discountAmt;
				 System.out.println("Total Amount: " +totalPrice);
	}
	public static void main(String[] args){
		OffSeason obj=new OffSeason();
		obj.totalAmount();
	}
	} 

