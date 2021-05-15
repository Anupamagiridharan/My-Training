package Palindromestr;

public class Palindromestr {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		String a="madam";
		String reversedString=reverseString(a);
		if(a.equals(reversedString)) {
			System.out.println(a + " is palindrome");}
		else {
			System.out.println(a + " is not a palindrome");
		
		
		}

	}

	private static String reverseString(String a) {
		// TODO Auto-generated method stub
		StringBuffer buffer=new StringBuffer();
		buffer.append(a);
		return buffer.reverse().toString();
	}

}
