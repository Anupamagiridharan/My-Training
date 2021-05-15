package abstraction;

public class Honda extends Bike {
@Override
public void getname() {
	System.out.println("Hero Honda");
	
}
public static void main (String[] args) {
	Honda h=new Honda();
	Bike b=new Honda();
	b.getname();
}
}
