package encapsulation;

public class Students {
	public static void main(String[] args) {
		StudentDetails stud=new StudentDetails();
		stud.setName("Anupama");
		stud.setStd("OBS");
		stud.setRollno(6);
		System.out.println("Name: " +stud.getName());
		System.out.println("std: " +stud.getStd());
		System.out.println("Rollno: " +stud.getRollno());
		
		
	}

}
