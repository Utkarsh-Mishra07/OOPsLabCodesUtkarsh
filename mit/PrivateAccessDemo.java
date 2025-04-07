package edu.manipal.mit;

public class PrivateAccessDemo {
	public static void main(String[] args) {
	    
		 Studentz studentz = new Studentz();

	     studentz.setName("John Doe");
	     studentz.setRollNumber(12345);

	     System.out.println("Student Name: " + studentz.getName());
	     System.out.println("Student Roll Number: " + studentz.getRollNumber());

	     System.out.println(studentz.name);       
	     System.out.println(studentz.roll);		
	 }

}

