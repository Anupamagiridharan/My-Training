package vowels;
import java.util.Scanner;
public class Vowels {
	
	static Scanner in=new Scanner(System.in);
	public boolean checkChar(String a ) {
		if(a.contains("a")) {
			return true;
			
		}
		else
			return false;
		
	}
	
	public static void main(String[] args) {
		Vowels obj=new Vowels();
		System.out.println("enter the string ");
		String s=in.nextLine();
		System.out.println(obj.checkChar(s)); 
				
			
		
	}

}
