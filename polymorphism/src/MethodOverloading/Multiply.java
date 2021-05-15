package MethodOverloading;

public class Multiply {
	
		   static int Multiply(int a, int b)
	    {
	        return a * b;
	    }
	       static double Multiply(double a, double b)
	    {
	        return a * b;
	    }
	
	  

	    public static void main(String[] args)
	    {
	  Multiply m=new Multiply();
	  
	        System.out.println(m.Multiply(2, 4));
	  
	        System.out.println(m.Multiply(5.0, 20.0));
	    }
	}


