package overriding;

public class Dob extends Name {
	void Print()
    {
        System.out.println("13-5-1998");
    }

    public static void main(String[] args)
    {
  
      Name a;
      
      a=new Name();
       a.Print();
       
  a=new Age();
       
       a.Print();
       a=new Dob();
       
       a.Print();
      
    }

}
